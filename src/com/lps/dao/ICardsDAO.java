package com.lps.dao;

import com.lps.pojo.Cards;

public interface ICardsDAO {
	public Cards findCardById(Integer id);
	public boolean save(Cards card);
}
