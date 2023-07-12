package com.minis.jdbc.core;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author tjy
 * @date 2023/04/25
 **/
public interface PreparedStatementCallback {

    Object doInPreparedStatement(PreparedStatement stmt) throws SQLException;
}
