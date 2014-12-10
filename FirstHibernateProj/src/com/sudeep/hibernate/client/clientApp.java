package com.sudeep.hibernate.client;

import java.util.Collection;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sudeep.hibernate.dto.Address;
import com.sudeep.hibernate.dto.UserDetails;
import com.sudeep.hibernate.dto.Vehical;

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

		// UserDetails user1 = new UserDetails();
		// user1.setUserName("First User");
		//
		// Address address = new Address();
		// address.setStreet("street");
		// address.setCity("city name");
		//
		// Address address1 = new Address();
		// address.setStreet("street1");
		// address.setCity("city name1");
		// user1.setHomeAddress(address);
		// user1.setOfficeAddress(address1);
		// SessionFactory sessionFactory = new Configuration().configure()
		// .buildSessionFactory();
		// Session session = sessionFactory.openSession();
		// session.beginTransaction();
		// session.save(user1);
		//
		// session.getTransaction().commit();
		// session.close();
		// >>>>>>>>>>>>>>>>>>>>>>>>*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		// After Full these properties siplefy the code.
		// Address address = new Address();
		// address.setStreet("street1");
		// address.setCity("city name1");
		//
		// Address address1 = new Address();
		// address1.setStreet("street2");
		// address1.setCity("city name2");
		//
		// UserDetails user1 = new UserDetails();
		// user1.setUserName("First User");
		// user1.getAddresses().add(address);
		// user1.getAddresses().add(address1);
		//
		// SessionFactory sessionFactory = new Configuration().configure()
		// .buildSessionFactory();
		// Session session = sessionFactory.openSession();
		// session.beginTransaction();
		// session.save(user1);
		// session.getTransaction().commit();
		// session.close();
		// // code to pull up user data from data base.
		// session = sessionFactory.openSession();
		// user1 = null;
		// user1 = (UserDetails) session.get(UserDetails.class, 1);
		// // Here it will not pull all address assosiated with this user. it's
		// // default behaviour.
		// // if we want addresses of that user
		// session.close();
		// System.out.println(user1.getAddresses().size());
		// <<<<<<<<<<<<<<<<<<??????>>>>>>>>>>>>>>>This is Third
		// change<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		UserDetails user1 = new UserDetails();
		user1.setUserName("First User");
		Vehical vehical1 = new Vehical();
		vehical1.setVehicalName("car");
		Vehical vehical2 = new Vehical();
		vehical2.setVehicalName("Bike");
		// user1.setVehical(vehical);
		user1.getVehicals().add(vehical1);
		user1.getVehicals().add(vehical2);
		vehical1.getUsers().add(user1);
		vehical2.getUsers().add(user1);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user1);
		session.save(vehical1);
		session.save(vehical2);
		session.getTransaction().commit();
		session.close();
	}

}
