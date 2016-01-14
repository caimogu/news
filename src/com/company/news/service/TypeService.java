package com.company.news.service;

import java.sql.SQLException;
import java.util.List;

import com.company.news.bean.Type;
import com.company.news.dao.TypeDAO;

public class TypeService {

	private TypeDAO typedao;
	public TypeService() throws Exception{
		typedao=new TypeDAO();
	}
	public List<Type> getAll(){
		try {
			return (List<Type>) typedao.select();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
