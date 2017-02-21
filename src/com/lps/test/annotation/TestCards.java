package com.lps.test.annotation;


import java.sql.Date;

import org.junit.Test;

import com.lps.dao.ICardsDAO;
import com.lps.dao.impl.CardsDAOImpl;
import com.lps.pojo.Cards;
import com.lps.pojo.Users;

public class TestCards {
	ICardsDAO cardsDAO=new CardsDAOImpl();
	@Test
	public void save() {
		Cards card=new Cards();
		card.setCardNum("55555555555");
		card.setEndTime(new Date(11111111111L));
		Users user=new Users();
		user.setUserName("ª∆‹Œ");
		user.setCard(card);
		card.setUser(user);
		System.out.println(cardsDAO.save(card));
	}

}
