package com.ismo.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ismo.entites.Appartement;
import ma.ismo.crjj.util.HibernateUtil;



public class DaoAppartement implements IDao<Appartement> {


		@Override
		public List<Appartement> getAll() {
			Session session = HibernateUtil.getSessionfactory().getCurrentSession();
			Transaction t = session.beginTransaction();

			List<Appartement> aprts = session.createQuery("from Appartement").getResultList();

			t.commit();
			session.close();

			return aprts;
		}

		@Override
		public Appartement getOne(int id) {
			Session session = HibernateUtil.getSessionfactory().getCurrentSession();
			Transaction t = session.beginTransaction();

			Appartement Etage = session.get(Appartement.class, id);

			t.commit();
			session.close();

			return Etage;
		}

		@Override
		public boolean add(Appartement obj) {
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
		public boolean update(Appartement obj) {
		
			try {
			Session session = HibernateUtil.getSessionfactory().getCurrentSession();
			Transaction t = session.beginTransaction();

			session.update(obj);

			t.commit();
			session.close();
			return true;}catch(Exception e){return false;}
		}
		
		

		@Override
		public boolean delete(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
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