package com.company.news.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.news.bean.Type;
import com.company.news.mysql.conn.impl.MysqlConn;

public class TypeDAO {
private Connection conn;
private PreparedStatement ps;
private ResultSet rs;
public TypeDAO() throws Exception{
	MysqlConn mysql=new MysqlConn();
	conn=mysql.getConnection();
}
public List<?> select() throws SQLException{
	List<Type> list=new ArrayList<Type>();
	String sql="SELECT * FROM tbl_news_type";
	ps=conn.prepareStatement(sql);
	rs=ps.executeQuery();
	while(rs.next()){
		Type t=new Type();
		t.setId(rs.getInt(1));
		t.setTypename(rs.getString(2));
		list.add(t);
	}
	return list;
}
}
