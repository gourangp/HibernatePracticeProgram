package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sathya.entity.Item;

public class LoadItem {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("com/sathya/config/hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Object o = session.load(Item.class, 107);
		Item i = (Item) o;
		System.out.println(i.getItemId());
		System.out.println(i.getItemName());
		System.out.println(i.getPrice());
		session.close();
		factory.close();

	}

}
