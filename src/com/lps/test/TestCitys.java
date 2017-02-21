package com.lps.test;

import java.util.Set;

import org.junit.Test;

import com.lps.dao.ICitysDAO;
import com.lps.dao.impl.CitysDAOImpl;
import com.lps.pojo.Citys;
import com.lps.pojo.Users;

public class TestCitys {
	private ICitysDAO citysDAO=new CitysDAOImpl();
	@Test
	public void test() {
		Citys city=citysDAO.findCitysById(1);
		System.out.println(city.getCityName());
		System.out.println(city.getUsers().size());
		//����set����
		Set<Users> set=city.getUsers();
		for(Users user:set){
			System.out.println(user.getUserName());
			System.out.println(user.getCity().getCityName());
		}
	}
	@Test
	public void save(){
		Citys city=new Citys();
		city.setCityName("�½�");
		Users user1=new Users();
		user1.setUserName("1����");
		user1.setCity(city);
		city.getUsers().add(user1);
		Users user2=new Users();
		user2.setUserName("2����");
		user2.setCity(city);
		city.getUsers().add(user2);
		Users user3=new Users();
		user3.setUserName("3����");
		user3.setCity(city);
		city.getUsers().add(user3);
		boolean flag=citysDAO.save(city);
		if(flag){
			System.out.println("����ɹ�");
		}else{
			System.out.println("����ʧ��");
		}
	}

}
