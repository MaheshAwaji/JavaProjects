package com.te.studentManagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDAOImplementation implements StudentDAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("My_Sql");
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	public static void main(String[] args) {
		StudentDAOImplementation daoImplementation = new StudentDAOImplementation();
//		daoImplementation.addStudent();
	}

	@Override
	public void addStudent() {
//		entityManager = entityManagerFactory.createEntityManager();
//		entityTransaction = entityManager.getTransaction();
//		Student student1 = new Student();
//		student1.setS_name("Rakesh");
//		student1.setS_mobile(9876543210l);
//
//		Address address1 = new Address();
//		address1.setCity("Pune");
//		address1.setStreet("Dhange Chowk");
//		address1.setPincode(123434);
//
//		student1.setAddress(address1);
//		address1.setStudent(student1);
		

//		entityTransaction.begin();
//		entityManager.persist(student1);
//		entityManager.persist(address1);
//		entityTransaction.commit();

	}

	@Override
	public void removeStudent() {
		
		
	}

}
