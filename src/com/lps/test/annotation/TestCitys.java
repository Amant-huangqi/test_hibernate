package com.lps.test.annotation;


import java.sql.Date;

import org.junit.Test;

import com.lps.dao.ICitysDAO;
import com.lps.dao.impl.CitysDAOImpl;
import com.lps.pojo.Citys;
import com.lps.pojo.Users;

public class TestCitys {
	ICitysDAO citysDAO=new CitysDAOImpl();
	@Test
	public void save() {
		Citys city=new Citys();
		city.setCityName("Œ¥¿¥≥«");
		Users user=new Users();
		user.setUserName("ª∆‹Œ");
		user.setCity(city);
		city.getUsers().add(user);
		System.out.println(citysDAO.save(city));
	}

}
