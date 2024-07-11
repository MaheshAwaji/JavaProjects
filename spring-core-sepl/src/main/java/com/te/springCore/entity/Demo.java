package com.te.springCore.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{30+22}")
	private int x;
	@Value("#{2+23+4+5+0}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(81)}")
	private double z;
	@Value("#{T(java.lang.Math).E}")
	private double a;
	
	@Value("#{new java.lang.String('Mahesh Awaji')}")
	private String name;
	
	@Value("#{6>4}")
	private boolean isActive;

	
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	

}
