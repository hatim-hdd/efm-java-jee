package com.ismo.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import ismo.entites.Appartement;
import ismo.entites.Immeuble;

public class DaoImmeuble implements IDao<Immeuble> {

	@Override
	public List<Immeuble> getAll() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Immeuble getOne(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Immeuble p) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Immeuble p) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
