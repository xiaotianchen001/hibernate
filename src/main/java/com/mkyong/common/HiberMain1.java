package com.mkyong.common;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class HiberMain1 {

	public static void main(String[] args) {
		UserDetails ud=new UserDetails();
	
		ud.setUserName("daidai si");
		
//		Address ad=new Address();
//		ad.setCity("OKC");
//		ad.setStreet("2400nw");
//		ud.setAddress(ad);
//		
//		Address ad1=new Address();
//		ad1.setCity("jinan");
//		ad1.setStreet("qipan");
//		ud.getList().add(ad1);
//		Address ad2=new Address();
//		ad2.setCity("zhangjiakou");
//		ad2.setStreet("shangdang");
//		ud.getList().add(ad2);
		
		Vehicle ve=new Vehicle();
		ve.setName("porche");
		
		Vehicle ve2=new Vehicle();
		ve2.setName("BMW");
		ud.getVe().add(ve);
		ud.getVe().add(ve2);
		ve.setUd(ud);
		ve2.setUd(ud);
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(ud);
		session.save(ve);
		session.save(ve2);
		session.getTransaction().commit();
		session.close();
		
		
	}

}
