package com.te.studentManagement.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.studentManagement.oneToManyEntity.Student1;
import com.te.studentManagement.oneToManyEntity.Subject;

public class StudentDAOOneToMany implements StudentDAO {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("My_Sql");
	EntityManager entityManager;
	EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		StudentDAOOneToMany daoOneToMany=new StudentDAOOneToMany();
		daoOneToMany.addStudent();
	}

	@Override
	public void addStudent() {
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		Student1 student1=new Student1();
		student1.setS_name("Mahesh");
		student1.setS_mobile(12345344l);
		
		Subject subject1=new Subject();
		subject1.setSubject_name("Core Java");
		subject1.setSubject_fees(15000.0);
		
		Subject subject2=new Subject();
		subject2.setSubject_name("SQL");
		subject2.setSubject_fees(10000.0);
		
		Subject subject3=new Subject();
		subject3.setSubject_name("Web Tech");
		subject3.setSubject_fees(20000.0);
		
		List<Subject> subjects=new ArrayList<>();
		subjects.add(subject1);
		subjects.add(subject2);
		subjects.add(subject3);
		
		student1.setSubjects(subjects);
		subject1.setStudent1(student1);
		subject2.setStudent1(student1);
		subject3.setStudent1(student1);
		
		
		
		entityTransaction.begin();
		
		entityManager.persist(subject1);
		entityManager.persist(subject2);
		entityManager.persist(subject3);
		entityManager.persist(student1);
		entityTransaction.commit();
		
		
		
		
	}

	@Override
	public void removeStudent() {
		// TODO Auto-generated method stub
		
	}

}
