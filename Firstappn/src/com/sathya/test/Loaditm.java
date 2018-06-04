package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sathya.entity.Item;

public class Loaditm {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("com/sathya/config/hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory();
		Session session1 = factory.openSession();
		Session session2 = factory.openSession();
		Object o1 = session1.get(Item.class, 1001);// hit the database
		Object o2 = session1.get(Item.class, 1002);//  hit the database
		Object o3 = session2.get(Item.class, 1001);// hit the database
		session1.evict(o1);
		Object o4= session1.get(Item.class, 1002);// does not hit the database
		session1.clear();
		Object o5= session1.get(Item.class, 1001);// hit the database
		
		Item i = (Item) o1;
		System.out.println(i.getItemId());
		System.out.println(i.getItemName());
		System.out.println(i.getPrice());
		
		
		i.setPrice(86560);
		Transaction tx= session1.beginTransaction();
		session1.update(i);
		tx.commit();
		session1.close();
		factory.close();

	}

}
