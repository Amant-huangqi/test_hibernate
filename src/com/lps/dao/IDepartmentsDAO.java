package com.lps.dao;

import com.lps.pojo.Departments;

public interface IDepartmentsDAO {
	public Departments findDepartmentsById(Integer id);
	public boolean save(Departments department);
}
