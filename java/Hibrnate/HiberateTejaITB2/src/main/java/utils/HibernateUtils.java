package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {

	 public static Session getSession() {		 
		 StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
         Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
         SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
         Session session=sessionFactory.openSession();
         return session;
	 }
}

  