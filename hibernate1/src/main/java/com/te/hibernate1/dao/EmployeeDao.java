package com.te.hibernate1.dao;

import com.te.hibernate1.entity.Employee;

public interface EmployeeDao {
	int addEmployee(Employee employee);
	Employee getEmployee(Integer id);
	void updateEmployee(Integer id,Employee employee);
	void deleteEmployee(Integer id);
	
	

}
