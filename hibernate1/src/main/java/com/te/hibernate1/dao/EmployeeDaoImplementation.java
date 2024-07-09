package com.te.hibernate1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate1.entity.Employee;

public class EmployeeDaoImplementation implements EmployeeDao {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	@Override
	public int addEmployee(Employee employee) {
		openConnection();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		closeConnection();
		return employee.getEmp_id();
	}

	@Override
	public Employee getEmployee(Integer id) {
		openConnection();
		Employee employee = entityManager.find(Employee.class, id);
		if (employee != null) {
			return employee;
		} else {
			System.out.println("Employee does not exist");
		}
		closeConnection();
		return employee;

	}

	@Override
	public void updateEmployee(Integer id, Employee employee) {
		openConnection();
		Employee employeeDb = entityManager.find(Employee.class, id);

		if (employee.getEmp_name() != null) {
			employeeDb.setEmp_name(employee.getEmp_name());
		}
		if (employee.getEmp_age() != null) {
			employeeDb.setEmp_age(employee.getEmp_age());

		}
		if (employee.getEmp_mobile() != null) {
			employeeDb.setEmp_age(employee.getEmp_age());

		}

		entityTransaction.begin();
		entityManager.persist(employeeDb);
		entityTransaction.commit();

		closeConnection();

	}

	@Override
	public void deleteEmployee(Integer id) {
		openConnection();
		Employee employee = entityManager.find(Employee.class, id);
		if (employee != null) {

			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();

		} else {
			System.out.println("Employee does not exist");
		}

		closeConnection();

	}

	public static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("employee_management");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}

	public static void closeConnection() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction != null) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}

		}
	}

}
