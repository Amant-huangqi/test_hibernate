package com.lps.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.lps.pojo.Users;

public class BaseDAO {
	private static Configuration conf;
	private static SessionFactory sessionFactory;
	static {
//		conf=new Configuration();
		conf=new AnnotationConfiguration();
		conf.configure("/hibernate.cfg.xml");
		sessionFactory=conf.buildSessionFactory();
	}
	public Session getSession(){
		Session session=sessionFactory.openSession();
		return session;
	}
	public boolean save(Object obj) {

		Transaction tx=null;
		try {
			Session session=getSession();
			tx = session.beginTransaction();
			session.save(obj);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}
		
		return false;
	}
	public boolean update(Object obj) {

		Transaction tx=null;
		try {
			Session session=getSession();
			tx = session.beginTransaction();
			session.update(obj);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}
		
		return false;
	}
	public boolean delete(Object obj) {

		Transaction tx=null;
		try {
			Session session=getSession();
			tx = session.beginTransaction();
			session.delete(obj);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}
		
		return false;
	}
}
