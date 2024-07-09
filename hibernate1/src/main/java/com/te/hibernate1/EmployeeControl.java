package com.te.hibernate1;

import com.te.hibernate1.dao.EmployeeDaoImplementation;
import com.te.hibernate1.entity.Employee;

public class EmployeeControl {
	public static void main(String[] args) {
		EmployeeDaoImplementation main=new EmployeeDaoImplementation();
		Employee employee=new  Employee().builder().emp_age(24).emp_name("Akash").emp_mobile(1234567l).build();
//		main.addEmployee(employee);
//		System.out.println(main.getEmployee(14));
//		main.updateEmployee(3, new Employee().builder().emp_age(30).build());
		main.deleteEmployee(3);
	
		
	}

}
