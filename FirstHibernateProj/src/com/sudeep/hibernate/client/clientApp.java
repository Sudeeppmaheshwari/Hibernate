package com.sudeep.hibernate.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sudeep.hibernate.dto.UserDetails;

public class clientApp {

	public static void main(String[] args) {

		// UserDetails userDetails = new UserDetails();
		// userDetails.setUserId(1);
		// userDetails.setUserName("First User");
		// userDetails.setAddress("test address.");
		// userDetails.setJoinedDate(new Date());
		// userDetails.setDetails("Description");
		//
		// SessionFactory sessionFactory = new Configuration().configure()
		// .buildSessionFactory();
		// Session session = sessionFactory.openSession();
		// session.beginTransaction();
		// session.save(userDetails);
		// session.getTransaction().commit();
		// session.close();
		//
		//
		// userDetails=null;
		// session=sessionFactory.openSession();
		// session.beginTransaction();
		// userDetails=(UserDetails) session.get(UserDetails.class, 1);//Here
		// 1'st parameter is class what we need to retrive
		// //2'nd parameter is for primary key by which it understand that this
		// record will be taken.
		// System.out.println("User Details are as follows : \nUser Name : "+userDetails.getUserName());

		// <<<<<<<<<<<<<<<<<<<<<<<<<<<<*>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// After Full these properties siplefy the code.

		UserDetails user1 = new UserDetails();
		user1.setUserName("First User");
		UserDetails user2=new UserDetails();
		user2.setUserName("Second User");
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user1);
		session.saveOrUpdate(user2);
		session.getTransaction().commit();
		session.close();

	}

}
