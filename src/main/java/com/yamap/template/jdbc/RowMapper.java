package com.yamap.template.jdbc;

import java.sql.ResultSet;

/**
 * Date:2019/4/5
 * Author:gyc
 * Desc:
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs, int rowNum) throws Exception;

}
