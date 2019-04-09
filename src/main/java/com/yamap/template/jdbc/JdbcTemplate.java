package com.yamap.template.jdbc;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Date:2019/4/5
 * Author:gyc
 * Desc:
 */
public abstract class JdbcTemplate<T> {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public List<?> excuteQuery(String sql,Object[] params,RowMapper<T> rowMapper) throws Exception {


        //1.获取连接
        Connection connection = dataSource.getConnection();

        //得到预处理对象
        PreparedStatement prepareStatement = this.createPrepareStatement(connection, sql);


        //处理结果集
        ResultSet resultSet = excuteQuery(prepareStatement, params);

        //处理结果集
        List<?> result = handleResultSet(resultSet, rowMapper);


        //关闭结果集
        closeResultSet(resultSet);

        //关闭预处理对象
        closePreparedStatement(prepareStatement);

        //关闭连接
        closeConnection(connection);

        return result;


    }

    protected  void closePreparedStatement(PreparedStatement prepareStatement) throws SQLException {
        prepareStatement.close();
    }

    protected  void closeResultSet(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }

    protected  List<?> handleResultSet(ResultSet resultSet, RowMapper<?> rowMapper) throws Exception {
        List<Object> result = new ArrayList<>();
        int rowNum = 1;
        while (resultSet.next()){
            result.add(rowMapper.mapRow(resultSet,rowNum++));
        }

        return result;

    }

    protected  void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }

    public ResultSet excuteQuery(PreparedStatement prepareStatement, Object[] params) throws SQLException {
        if(params != null){
            for (int i = 0; i < params.length; i++) {
                prepareStatement.setObject(i,params[i]);

            }
        }
       return  prepareStatement.executeQuery();

    }

        protected PreparedStatement createPrepareStatement(Connection connection,String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }



}
