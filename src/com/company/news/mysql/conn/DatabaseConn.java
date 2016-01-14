package com.company.news.mysql.conn;

import java.sql.Connection;
import java.sql.SQLException;

public interface DatabaseConn {
	public Connection getConnection()throws SQLException; 
}
