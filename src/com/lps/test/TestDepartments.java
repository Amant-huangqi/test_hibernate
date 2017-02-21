package com.lps.test;

import org.junit.Test;

import com.lps.dao.IDepartmentsDAO;
import com.lps.dao.impl.DepartmentsDAOImpl;
import com.lps.pojo.Departments;
import com.lps.pojo.Users;

public class TestDepartments {
	private IDepartmentsDAO departmentsDAO=new DepartmentsDAOImpl();
	@Test
	public void test() {
		Departments department=departmentsDAO.findDepartmentsById(1);
		System.out.println(department.getDepName());
		System.out.println(department.getDepCname());
		System.out.println(department.getUsers().size());
		for(Users user:department.getUsers()){
			System.out.println(user.getUserName());
		}
	}

}
