package com.te.springCore.entity;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee   {
	private int employeeId;
	private String employeeName;
	private long mobile;
	
	//It will ckeck byName
//	@Autowired
//	@Qualifier("address1")
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
	
	//Constructor
	@Autowired
	public Employee( @Qualifier("address2") Address address) {
		super();
		this.address = address;
		System.out.println("Inside constuctor");
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
	
//	@Autowired
//	@Qualifier("address2")
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


