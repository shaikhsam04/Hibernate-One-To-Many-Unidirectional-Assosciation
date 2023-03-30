package com.jsp.hospital.branch;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestController {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sameer");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Branches b1=new Branches();
		b1.setName("TATA");
		b1.setLocation("JUHU");
		
		Branches b2=new Branches();
		b2.setName("DYPATIL");
		b2.setLocation("NERUL");
		
		Branches b3=new Branches();
		b3.setName("HEALTH CARE");
		b3.setLocation("THANE");
		
		ArrayList< Branches>a1=new ArrayList();
		a1.add(b3);
		a1.add(b2);
		a1.add(b1);
		
		
		Hospital hospital=new Hospital();
		hospital.setName("Sameer");
		hospital.setEmail("sam@gmail.com");
		hospital.setBranches(a1);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(b1);
		entityManager.persist(b2);
		entityManager.persist(b3);

		entityTransaction.commit();
		System.out.println("all good");
		
		
		
		
	}

}