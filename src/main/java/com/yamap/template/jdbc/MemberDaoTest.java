package com.yamap.template.jdbc;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 * Date:2019/4/5
 * Author:gyc
 * Desc:
 */
public class MemberDaoTest {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test";
        String username= "root";
        String password = "root";
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setURL(url);
        mysqlDataSource.setUser(username);
        mysqlDataSource.setPassword(password);

        MemberDao memberDao = new MemberDao(mysqlDataSource);
        List<Member> members = memberDao.selectAll();
        System.out.println(members);

    }
}
