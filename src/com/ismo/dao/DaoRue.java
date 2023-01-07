package com.ismo.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ismo.entites.Immeuble;
import ismo.entites.Rue;
import ma.ismo.crjj.util.HibernateUtil;

public class DaoRue implements IDao<Rue> {

	@Override
	public List<Rue> getAll() {
		Session session = HibernateUtil.getSessionfactory().getCurrentSession();
		Transaction t = session.beginTransaction();

		List<Rue> Rue = session.createQuery("from Rue").getResultList();

		t.commit();
		session.close();

		return Rue;
	}

	@Override
	public Rue getOne(int id) {
		Session session = HibernateUtil.getSessionfactory().getCurrentSession();
		Transaction t = session.beginTransaction();

		Rue Rue = session.get(Rue.class, id);

		t.commit();
		session.close();

		return Rue;
	}

	@Override
	public boolean add(Rue obj) {
		try {
			Session session = HibernateUtil.getSessionfactory().getCurrentSession();
			Transaction t = session.beginTransaction();

			Object o = session.save(obj);

			System.out.println(o);

			t.commit();
			session.close();

			if (o == null)
				return false;
			else
				return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(Rue obj) {
		try {
			Session session = HibernateUtil.getSessionfactory().getCurrentSession();
			Transaction t = session.beginTransaction();

			session.update(obj);

			t.commit();
			session.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(int id) {
		try {
			Session session = HibernateUtil.getSessionfactory().getCurrentSession();
			Transaction t = session.beginTransaction();

			session.delete(id);

			t.commit();
			session.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
  
}
