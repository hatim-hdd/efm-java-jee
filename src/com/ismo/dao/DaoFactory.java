package com.ismo.dao;

public class DaoFactory {
	
	
	public static IDao getDAO(TypeDao type) {
		switch (type) {
			case Appartement: return new DaoAppartement();
			case Immeuble: return new DaoImmeuble();
			case Rue: return new DaoRue();
			case Etage: return new DaoEtage();
			
		}
		return null;
	}

}
