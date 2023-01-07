package com.ismo.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import ismo.entites.Appartement;



public class DaoAppartement implements IDao<Appartement> {

	@Override
	public List<Appartement> getAll() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appartement getOne(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Appartement p) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Appartement p)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public boolean delete(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
