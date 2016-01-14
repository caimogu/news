package com.company.news.dao.imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.company.news.bean.User;
import com.company.news.dao.IUserDAO;
import com.company.news.mysql.conn.impl.MysqlConn;

public class UserDAO implements IUserDAO{
	private User u;
	public Connection conn;
	public PreparedStatement ps;
	public ResultSet rs;
	public UserDAO() throws SQLException{
		MysqlConn mysql=new MysqlConn();
		conn=mysql.getConnection();
	}
	public User findByNamePass (User user) throws Exception{
		User u=null;
		String sql="SELECT * FROM tbl_user WHERE username=? and password =?";
		ps=conn.prepareStatement(sql);
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getPasword());
		rs=ps.executeQuery();
		if(rs.next()){
			u=new User();
			u.setId(rs.getInt(1));
			u.setUsername(rs.getString(2));
			u.setPasword(rs.getString(3));
			u.setRole(rs.getInt(4));
		}
		return u;
	}
	public void insert(Object o) throws SQLException {
		// TODO Auto-generated method stub
		User u=null;
		String sql="SELECT * FROM tbl_user WHERE username=? and password =?";
		ps=conn.prepareStatement(sql);
		ps.setString(1, u.getUsername());
		ps.setString(2, u.getPasword());
		
	}
	public void update(Object o) {
		// TODO Auto-generated method stub
		
	}
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	public List<?> select(String cond) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
