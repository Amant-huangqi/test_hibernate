package com.lps.dao;

import java.util.List;

import com.lps.pojo.Users;

public interface IUsersDAO {
	//CRUD
	public boolean save(Users user);
	public Users getUsersById(Integer id);
	public boolean delete(Users user);
	public boolean update(Users user);
	public List<Users> findByUserName(String queryStr);
}
