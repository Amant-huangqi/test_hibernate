package com.lps.dao.impl;

import org.hibernate.Session;

import com.lps.dao.IDepartmentsDAO;
import com.lps.pojo.Departments;

public class DepartmentsDAOImpl extends BaseDAO implements IDepartmentsDAO{

	@Override
	public Departments findDepartmentsById(Integer id) {
		Session session=getSession();
		Departments card=(Departments)session.get(Departments.class, id);
		session.close();
		return card;
	}

	@Override
	public boolean save(Departments department) {
		return super.save(department);
	}

}
