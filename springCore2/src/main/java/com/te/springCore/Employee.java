package com.te.springCore;

import java.util.Objects;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeeJobTitle;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String employeeName, String employeeJobTitle) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeJobTitle = employeeJobTitle;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeJobTitle() {
		return employeeJobTitle;
	}
	public void setEmployeeJobTitle(String employeeJobTitle) {
		this.employeeJobTitle = employeeJobTitle;
	}
	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeJobTitle, employeeName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(employeeJobTitle, other.employeeJobTitle)
				&& Objects.equals(employeeName, other.employeeName);
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeJobTitle="
				+ employeeJobTitle + "]";
	}
	
	
	
	

}
