package com.company.news.dao;

import java.sql.SQLException;
import java.util.List;

public interface INewsDAO {
	public void insert(Object o)throws SQLException;
	public void update(Object o);
	public void delete(int id);
	public List<?> select(String cond) throws SQLException;

}
