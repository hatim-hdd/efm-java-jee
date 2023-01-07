package ma.ismo.crjj.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import ismo.entites.Appartement;
import ismo.entites.Etage;
import ismo.entites.Immeuble;
import ismo.entites.Rue;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	private static final ServiceRegistry serviceRegistry;
	
	static {
		Configuration config = new Configuration();
		config.configure();
		
		config.addAnnotatedClass(Appartement.class);
		config.addAnnotatedClass(Etage.class);
		config.addAnnotatedClass(Immeuble.class);
		config.addAnnotatedClass(Rue.class);
		
		
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sessionFactory = config.buildSessionFactory(serviceRegistry);
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
}
