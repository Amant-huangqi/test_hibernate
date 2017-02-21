package com.lps.dao.impl;

import com.lps.dao.ICardsDAO;
import com.lps.pojo.Cards;

public class CardsDAOImpl extends BaseDAO implements ICardsDAO{

	@Override
	public Cards findCardById(Integer id) {
		Cards card=(Cards)getSession().get(Cards.class, id);
		return card;
	}

	@Override
	public boolean save(Cards card) {
		return super.save(card);
	}

}
