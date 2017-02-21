package com.lps.test;

import java.sql.Date;
import java.util.List;

import org.junit.Test;

import com.lps.dao.ICitysDAO;
import com.lps.dao.IDepartmentsDAO;
import com.lps.dao.IUsersDAO;
import com.lps.dao.impl.CitysDAOImpl;
import com.lps.dao.impl.DepartmentsDAOImpl;
import com.lps.dao.impl.UsersDAOImpl;
import com.lps.pojo.Cards;
import com.lps.pojo.Citys;
import com.lps.pojo.Departments;
import com.lps.pojo.Users;

public class TestHibernate {
	private IUsersDAO usersDAO=new UsersDAOImpl();
	private ICitysDAO citysDAO=new CitysDAOImpl();
	private IDepartmentsDAO departmentsDAO=new DepartmentsDAOImpl();
	@Test
	public void save(){
		//hibernate对象的状态：自由态，游离态，持久态。
		Users user=new Users();
		user.setUserName("李岩11");
		Citys city=citysDAO.findCitysById(1);
		user.setCity(city);
		Cards card=new Cards();
		card.setCardNum("37013013031031031031");
		card.setEndTime(new Date(42424244242422L));
		card.setUser(user);
		user.setCard(card);
		Departments department1=new Departments();
		department1.setDepName("houqin");
		department1.setDepCname("后勤部");
		user.getDepartments().add(department1);
		Departments department2=departmentsDAO.findDepartmentsById(1);
		user.getDepartments().add(department2);
		usersDAO.save(user);
	}


	
	@Test
	public void delete(){
		Users user=usersDAO.getUsersById(6);
		usersDAO.delete(user);
	}
	@Test
	public void update(){
		Users user=usersDAO.getUsersById(9);
//		user.setUserName("黄琦");
		Citys city=citysDAO.findCitysById(2);
		user.setCity(city);
//		user.getCity().setCityName("烟台");
		usersDAO.update(user);
	}
	@Test
	public void query(){
		List<Users> list=usersDAO.findByUserName("杰");
		for(Users user:list){
			System.out.println(user.getUserName());
			System.out.println(user.getCity().getCityName());
		}
	}
}
