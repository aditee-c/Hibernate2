package com.zensar.hibernate.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class HQLmain {

	public static void main(String[] args) {
		//Hibernate query language ooql
		Configuration c = new Configuration().configure();//.configure read hibernate.cfg.xml
		SessionFactory f = c.buildSessionFactory();//singleton and heavy weight session factory
		Session s = f.openSession();//represents database connection
		Transaction t = s.beginTransaction();
		//JPA Query
		//Query q = s.createQuery("from Product");
		//Query q = s.createQuery("from Product p where p.price>5000 and p.price<100000");
		// q = s.createQuery("from Product p where p.price between 5000 and 100000");
		//Query q = s.createQuery("from Product p where p.brand like 'S%'");
		//Query q = s.createQuery("from Product p where p.name = 'Toaster'");
		
		/*List<Product> products = q.getResultList();
		for(Product p:products) {
			System.out.println(p);
		}*/
		//Query q = s.createQuery("select p.name,p.price from Product p");
		//Query q = s.createQuery("select p.productId,p.name,p.brand from Product p");
		/*Query q = s.createQuery("select p.price,p.name,p.brand from Product p");
		List<Object[]> objects = q.getResultList();
		for(Object[] o :objects){
			for(Object ob:o) {
			System.out.println(ob);}
		}*/
		Query q = s.createQuery("select max(p.price) from Product p");
		Double maxPrice = (Double) q.getSingleResult();
		System.out.println(maxPrice);
		Query q1 = s.createQuery("select min(p.price) from Product p");
		Double minPrice = (Double) q1.getSingleResult();
		System.out.println(minPrice);
		Query q3 = s.createQuery("select sum(p.price) from Product p");
		Double sumPrice = (Double) q3.getSingleResult();
		System.out.println(sumPrice);
		Query q2 = s.createQuery("select avg(p.price) from Product p");
		Double avgPrice = (Double) q2.getSingleResult();
		System.out.println(avgPrice);
		Query q4 = s.createQuery("select count(p.price) from Product p");
		long countPrice = (long) q4.getSingleResult();
		System.out.println(countPrice);
		Criteria c1 = s.createCriteria(Product.class);
		List<Product> products = c1.list(); 
		for(Product p: products) {
			System.out.println(p);
		}
		
		t.commit();
		s.close();
	}

}
