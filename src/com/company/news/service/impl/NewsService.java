package com.company.news.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.company.news.bean.News;
import com.company.news.dao.INewsDAO;
import com.company.news.dao.imple.NewsDAO;
import com.company.news.service.IserverNews;

public class NewsService implements IserverNews {

	public INewsDAO dao;
	
	public NewsService() throws SQLException{
		dao=new NewsDAO();
	}
	
	public void save(News news) {
		// TODO Auto-generated method stub
			try {
				dao.insert(news);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public void modify(News news) {
		// TODO Auto-generated method stub

	}

	public void remove(int id) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	public List<News> findAll() {
		// TODO Auto-generated method stub
			try {
				return (List<News>) dao.select("1");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	}

}
