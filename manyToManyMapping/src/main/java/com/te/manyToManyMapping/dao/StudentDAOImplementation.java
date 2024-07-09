package com.te.manyToManyMapping.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.manyToManyMapping.entity.Student;
import com.te.manyToManyMapping.entity.Subject;

public class StudentDAOImplementation implements StudentDAO {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("My_Sql");
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	public static void main(String[] args) {
		StudentDAOImplementation daoImplementation = new StudentDAOImplementation();
		daoImplementation.addStudent();
	}

	@Override
	public void addStudent() {
		Student student1 = new Student();
		student1.setName("Mahesh");
		student1.setEmail("maheshawaji111@gmail.com");

		Student student2 = new Student();
		student2.setName("Suresh");
		student2.setEmail("akash@gmail.com");

		Subject subject1 = new Subject();
		subject1.setName("Maths");
		subject1.setFees(10000l);

		Subject subject2 = new Subject();
		subject2.setName("Science");
		subject2.setFees(15000l);

		List<Student> students = new ArrayList();
		students.add(student1);
		students.add(student2);

		List<Subject> subjects = new ArrayList();
		subjects.add(subject1);
		subjects.add(subject2);

		student1.setSubjects(subjects);
		student2.setSubjects(subjects);

		subject1.setStudents(students);
		subject2.setStudents(students);

		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(subject1);
		entityManager.persist(subject2);

		entityTransaction.commit(); 

	}

}
