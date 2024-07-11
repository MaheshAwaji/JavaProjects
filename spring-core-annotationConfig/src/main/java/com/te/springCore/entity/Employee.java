package com.te.springCore.entity;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Value;

public class Employee   {
	@Value("1")
	private int employeeId;
	@Value("Mahesh Awaji")
	private String employeeName;
	@Value("1234566788")
	private long mobile;
	private Address address;
	
	public Employee(int employeeId, String employeeName, long mobile, Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.mobile = mobile;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(Address address) {
		super();
		this.address = address;
	}
	public Employee(String string) {
		System.out.println(string);
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("Inside Setter");
		this.address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, employeeId, employeeName, mobile);
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
		return Objects.equals(address, other.address) && employeeId == other.employeeId
				&& Objects.equals(employeeName, other.employeeName) && mobile == other.mobile;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}
	
	
	
	

}


