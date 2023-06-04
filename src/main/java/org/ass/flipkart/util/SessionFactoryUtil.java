package org.ass.flipkart.util;

import org.ass.flipkart.entity.ProductEntity;
import org.ass.flipkart.entity.StockEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	
private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionPropertiesUtil.getMyDbProperties());
			cfg.addAnnotatedClass(ProductEntity.class);
			cfg.addAnnotatedClass(StockEntity.class);
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			return sessionFactory;
		}
		return sessionFactory;
			 
		}
}


