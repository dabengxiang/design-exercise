package com.yamap.template.jdbc;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * Date:2019/4/5
 * Author:gyc
 * Desc:
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<Member> selectAll() throws Exception {
        String sql = "select * from t_member";

        List list = excuteQuery(sql, null, new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                member.setAddr(rs.getString("nickname"));
                return member;

            }
        });

        return list;

    }
}
