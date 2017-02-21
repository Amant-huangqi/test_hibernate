package com.lps.test;

import java.sql.Date;

import org.junit.Test;

import com.lps.dao.ICardsDAO;
import com.lps.dao.impl.CardsDAOImpl;
import com.lps.pojo.Cards;
import com.lps.pojo.Citys;
import com.lps.pojo.Users;

public class TestCards {
	private ICardsDAO cardsDAO=new CardsDAOImpl();
	@Test
	public void test() {
		Cards card=cardsDAO.findCardById(1);
		System.out.println(card.getCardNum());
		System.out.println(card.getEndTime());
		System.out.println(card.getUser().getUserName());//外键关联对象
		System.out.println(card.getUserId());//主键
	}
	@Test
	public void save(){
		Cards card=new Cards();
		card.setCardNum("372010310310310310");
		Date endTime=new Date(1111111111111L);
		card.setEndTime(endTime);
		Users user=new Users();
		user.setUserName("柱子间");
		Citys city=new Citys();
		city.setCityName("商河");
		user.setCity(city);
		card.setUser(user);
		System.out.println(cardsDAO.save(card));
	}

}
