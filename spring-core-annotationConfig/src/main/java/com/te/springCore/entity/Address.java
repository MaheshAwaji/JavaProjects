package com.te.springCore.entity;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Value;


public class Address {
	@Value("123456")
	private int pincode;
	@Value("Pune")
	private String city;
	private String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int pincode, String city, String state) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		System.out.println("Setting pincode");
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("Setting city");
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		System.out.println("Setting state");
		this.state = state;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, pincode, state);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && pincode == other.pincode && Objects.equals(state, other.state);
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	

}
