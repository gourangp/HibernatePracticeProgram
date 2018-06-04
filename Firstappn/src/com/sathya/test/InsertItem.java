package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sathya.entity.Item;

public class InsertItem {

	public static void main(String[] args) {
		//load configuration file
		Configuration conf = new Configuration();
		conf.configure("com/sathya/config/hibernate.cfg.xml");
		//build session factory
		SessionFactory factory = conf.buildSessionFactory();
		//open session
		Session session = factory.openSession();
		
		Item item = new Item(105, "Sony", 6500);
		Transaction tx = session.beginTransaction();
		session.save(item);
		tx.commit();
		session.close();
		factory.close();
	}

}
