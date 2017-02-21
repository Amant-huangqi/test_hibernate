package com.lps.test.annotation;


import java.sql.Date;

import org.junit.Test;

import com.lps.dao.IDepartmentsDAO;
import com.lps.dao.impl.DepartmentsDAOImpl;
import com.lps.pojo.Departments;
import com.lps.pojo.Users;

public class TestDepartment {
	IDepartmentsDAO departmentsDAO=new DepartmentsDAOImpl();
	@Test
	public void save() {
		Departments department=new Departments();
		department.setDepName("newdepart");
		department.setDepCname("ĞÂ²¿ÃÅ");
		Users user=new Users();
		user.setUserName("»ÆÜÎ");
		department.getUsers().add(user);
		System.out.println(departmentsDAO.save(department));
	}

}
