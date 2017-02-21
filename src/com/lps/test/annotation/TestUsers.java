package com.lps.test.annotation;

import java.sql.Date;

import org.junit.Test;

import com.lps.dao.IUsersDAO;
import com.lps.dao.impl.UsersDAOImpl;
import com.lps.pojo.Cards;
import com.lps.pojo.Citys;
import com.lps.pojo.Departments;
import com.lps.pojo.Users;

public class TestUsers {
	IUsersDAO usersDAO=new UsersDAOImpl();
	@Test
	public void save() {
		Users user=new Users();
		user.setUserName("李珍基11");
		Cards card=new Cards();
		card.setCardNum("4224094242094209420911");
		card.setEndTime(new Date(11111111111L));
		card.setUser(user);
		user.setCard(card);
		Citys city=new Citys();
		city.setCityName("新城市");
		user.setCity(city);
		Departments dep=new Departments();
		dep.setDepName("depment");
		dep.setDepCname("未来部门");
		user.getDepartments().add(dep);
		System.out.println(usersDAO.save(user));
	}

}
