package com.ismo.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import ismo.entites.Etage;
import ismo.entites.Immeuble;

public class DaoEtage implements IDao<Etage>{

	@Override
	public List<Etage> getAll() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etage getOne(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Etage p) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Etage p) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
