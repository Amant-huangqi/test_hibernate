package com.lps.dao.impl;

import org.hibernate.Session;

import com.lps.dao.ICitysDAO;
import com.lps.pojo.Citys;

public class CitysDAOImpl extends BaseDAO implements ICitysDAO {
	@Override
	public Citys findCitysById(int id) {
		Session session=getSession();
		Citys city=(Citys)session.get(Citys.class, id);
		session.close();
		return city;
	}

	@Override
	public boolean save(Citys city) {
		return super.save(city);
	}

}
