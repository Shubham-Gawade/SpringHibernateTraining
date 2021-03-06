package com.xoriant.xorbankonline.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		if (null == sessionFactory) {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory;

	}

}
