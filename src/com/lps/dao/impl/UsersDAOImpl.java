package com.lps.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.lps.dao.IUsersDAO;
import com.lps.pojo.Users;

public class UsersDAOImpl extends BaseDAO implements IUsersDAO{

	@Override
	public boolean save(Users user) {
		return super.save(user);
	}

	@Override
	public Users getUsersById(Integer id) {
		Session session=getSession();
		Users user=(Users)session.get(Users.class, id);
		return user;
	}

	@Override
	public boolean delete(Users user) {
		return super.delete(user);
	}

	@Override
	public boolean update(Users user) {
		return super.update(user);
	}

	@Override
	public List<Users> findByUserName(String queryStr) {
		String hql="from Users where userName  like ?";
		Query query=getSession().createQuery(hql);
		query.setString(0, "%"+queryStr+"%");
		return query.list();
	}
	
	

}
