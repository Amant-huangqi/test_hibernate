package com.lps.dao;

import com.lps.pojo.Citys;

public interface ICitysDAO {

	Citys findCitysById(int i);
	boolean save(Citys city);
}
