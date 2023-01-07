package com.ismo.daotest;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.ismo.dao.DaoFactory;
import com.ismo.dao.IDao;
import com.ismo.dao.TypeDao;

import ismo.entites.Appartement;
import ismo.entites.Etage;



class DaoAppartementTest {

	@Test
	void getAlltest() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		IDao dao = DaoFactory.getDAO(TypeDao.Appartement);
		List<Appartement> ents = dao.getAll();
		
		assertNotNull(ents);
		assertEquals(ents.size(), 16);
	}
	
	@Test
	void getOnetest_1() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		IDao dao = DaoFactory.getDAO(TypeDao.Appartement);
		Appartement apt = (Appartement) dao.getOne(3);

		assertEquals(apt.getLettre_appartement(), "lettre1");
		assertEquals(apt.getNb_pieces_total(), 2);
		
	}
	
	@Test
	void getOnetest_2() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		IDao dao = DaoFactory.getDAO(TypeDao.Appartement);
		Appartement ent = (Appartement) dao.getOne(3000);

		assertNull(ent);
	}
	
	@Test
	void savetest() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		IDao dao = DaoFactory.getDAO(TypeDao.Appartement);
		List<Appartement> aprt_before = dao.getAll();
		Appartement aprt = new Appartement("lettre5",3);
		dao.add(aprt);
		List<Appartement> aprt_after = dao.getAll();
		assertEquals(aprt_before.size()+1, aprt_after.size());
	}

	

}
