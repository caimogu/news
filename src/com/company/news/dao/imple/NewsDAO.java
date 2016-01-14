package com.company.news.dao.imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.news.bean.News;
import com.company.news.dao.INewsDAO;
import com.company.news.mysql.conn.DatabaseConn;
import com.company.news.mysql.conn.impl.MysqlConn;

public class NewsDAO implements INewsDAO {
	
	public Connection conn;
	private DatabaseConn mysql;
	private PreparedStatement ps;
	private ResultSet rs;
	private int iRs;
	
	public NewsDAO() throws SQLException{
		mysql=new MysqlConn();
		conn=mysql.getConnection();
	}

	public void insert(Object o) throws SQLException  {
		// TODO Auto-generated method stub
		String sql="INSERT INTO tbl_news VALUES(null,?,?,?,?,?,?,?)";
		News news=(News)o;
		ps=conn.prepareStatement(sql);
		ps.setString(1, news.getTitle());
		ps.setInt(2, news.getType());
		ps.setString(3,news.getContext());
		ps.setString(4, news.getAuthor());
		ps.setString(5,news.getAddtime());
		ps.setString(6, news.getPic());
		ps.setString(7, news.getNote());
		iRs=ps.executeUpdate();
		System.out.println(iRs);
		showError(sql);
		ps.close();
		
		
	}

	private void showError(String sql) {
		// TODO Auto-generated method stub
		if(iRs!=0){
			System.out.println(sql);
		}
	}

	public void update(Object o) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<?> select(String cond) throws SQLException {
		// TODO Auto-generated method stub\
		String sql="SELECT * FROM tbl_news WHERE "+cond;
		ps=conn.prepareStatement(sql);
		rs=ps.executeQuery();
		List<News> list=new ArrayList<News>();
		News news =null;
		while(rs.next()){
			news =new News();
			news.setId(rs.getInt(1));
			news.setTitle(rs.getString(2));
			news.setType(rs.getInt(3));
			news.setContext(rs.getString(4));
			news.setAuthor(rs.getString(5));
			news.setAddtime(rs.getString(6));
			news.setPic(rs.getString(7));
			news.setNote(rs.getString(8));
			list.add(news);
			
		}
		return list;
	}
		
}
