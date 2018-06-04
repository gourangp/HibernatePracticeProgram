package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sathya.entity.Item;

public class DeleteTest {

	public static void main(String[] args) {
		Configuration conf= new Configuration();
		conf.configure("com/sathya/config/hibernate.cfg.xml");
		SessionFactory factory= conf.buildSessionFactory();
		Session session= factory.openSession();
		Item i= (Item)session.get(Item.class, 105);
		Transaction tx= session.beginTransaction();
		session.delete(i);
		tx.commit();
		session.close();
		factory.close();
	}

}
