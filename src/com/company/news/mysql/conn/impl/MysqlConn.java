package com.company.news.mysql.conn.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.company.news.mysql.conn.DatabaseConn;

public class MysqlConn implements DatabaseConn {

	private static  Connection conn;
	
	//静态代码块 初始化的直接载入
	static {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public MysqlConn(){
		}

	public Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		if(conn==null){
			conn=DriverManager.getConnection("jdbc:mysql://localhost/news?useUnicode=true&amp;characterEncoding=UTF-8","root","1234");
		}
		return conn;
	}
	
}
