package com.company.news.service;

import java.util.List;

import com.company.news.bean.User;

public interface IuserService {
	public void save(User user);
	public void modify(User user);
	public void remove(int id);
	public List<User> findAll();
}
