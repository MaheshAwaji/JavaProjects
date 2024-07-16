package com.te.sms.repository.implementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.sms.entity.Student;
import com.te.sms.repository.SmsRepository;

@Repository
public class SmsRepositoryImpl implements SmsRepository {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MySql");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	@Override
	public String register(Student student) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(student);
		transaction.commit();
		return student.getStudentRollNumber();
	}

	@Override
	public Student getStudent(String studentRollNumber) {
		return entityManager.find(Student.class, studentRollNumber) ;
	}

	@Override
	public boolean delete(String studentRollNumber) {
		// TODO Auto-generated method stub
		return false;
	}

}
