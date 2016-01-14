package com.company.news.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.company.news.bean.News;
import com.company.news.bean.User;
import com.company.news.dao.imple.UserDAO;
import com.company.news.service.IuserService;

public class UserService implements IuserService {
	
	public UserDAO userDao;
	
	public UserService() throws SQLException{
		userDao=new UserDAO();
	}
	public User getUser(String username,String password){
		User user=new User();
		user.setUsername(username);
		user.setPasword(password);
		try {
			user=userDao.findByNamePass(user);
			return user;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}
	public void modify(User user) {
		// TODO Auto-generated method stub
		
	}
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}
	public List<User> findAll() {
		// TODO Auto-generated method stub
		try {
			return (List<User>) userDao.select("1");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
