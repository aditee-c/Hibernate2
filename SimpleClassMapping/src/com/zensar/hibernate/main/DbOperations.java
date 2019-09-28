package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class DbOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();//.configure read hibernate.cfg.xml
		SessionFactory f = c.buildSessionFactory();//singleton and heavy weight session factory
		Session s = f.openSession();//represents database connection
		Transaction t = s.beginTransaction();
		//insert new record
		//Product p = new Product(1009, "Toaster", "Bajaj", 3000);
		//s.save(p);
		//get record 
		//Product p = new Product();
		 
		/*if(p == null) {
			System.out.println("Error");
		}else {
			System.out.println(p);
		}*/
				//update a record
		/*Product p =s.get(Product.class, 1003);	
		if(p == null) {
			System.out.println("Error");
		}else {
			p.setPrice( p.getPrice()+100);
			
			System.out.println(p);
		}*/
		Product p = s.get(Product.class, 1003);
		if(p==null) {
			System.out.println("Not found");
		}else {
			s.delete(p);
			System.out.println("Product is deleted successfully");
		}
		//Product p = s.load(Product.class, 1005);
		//System.out.println(p);
		t.commit();
		s.close();
		
	}

}
