package com.company.news.service;

import java.util.List;

import com.company.news.bean.News;

public interface IserverNews {
		public void save(News news);
		public void modify(News news);
		public void remove(int id);
		public List<News> findAll();
		
}
