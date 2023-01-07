package principale;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.hibernate.Session;

import com.ismo.dao.DaoAppartement;
import com.ismo.dao.DaoEtage;
import com.ismo.dao.DaoFactory;
import com.ismo.dao.DaoImmeuble;
import com.ismo.dao.DaoRue;
import com.ismo.dao.TypeDao;

import ismo.entites.Appartement;
import ismo.entites.Etage;
import ismo.entites.Immeuble;
import ismo.entites.Rue;
import ma.ismo.crjj.util.HibernateUtil;

public class Test {
public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
	
	Scanner rs =new Scanner(System.in);
	   
			DaoImmeuble doaImm= (DaoImmeuble) DaoFactory.getDAO(TypeDao.Immeuble);
			for(Immeuble em : doaImm.getAll())
				System.out.println(em);
			
			System.out.println("----------------------------------------------------");
		
			System.out.println("Donner l'id de rue");
			int id=rs.nextInt();
			DaoRue doaRue= (DaoRue) DaoFactory.getDAO(TypeDao.Rue);
			Rue rue = doaRue.getOne(id);
			for(Immeuble em : rue.getImeubles())
				System.out.println(em);
			
			System.out.println("----------------------------------------------------");
			
			System.out.println("Donner l' id de Appartement");
			String ids  = rs.next();
			DaoAppartement daoApp= (DaoAppartement) DaoFactory.getDAO(TypeDao.Appartement);
			Appartement app=new Appartement(ids,0);
			if(daoApp.delete(id))
				System.out.println("supprimer success");
			else
				System.out.println("error");
		System.out.println("----------------------------------------------------");
			System.out.println("Donner un id de etage");
			id  = rs.nextInt();
			DaoEtage daoEtage= (DaoEtage) DaoFactory.getDAO(TypeDao.Etage);
			
			System.out.println("----------------------------------------------------");
			
			System.out.println("Donner un nb App");
			int  nbApp = rs.nextInt();
			Etage et=new Etage();
			if(daoEtage.update(et))
				System.out.println("mofifier avec success");
			else 
				System.out.println("not modified");
}
}
