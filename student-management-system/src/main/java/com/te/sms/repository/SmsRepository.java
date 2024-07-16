package com.te.sms.repository;

import com.te.sms.entity.Student;

public interface SmsRepository {
	public abstract String register(Student student);
	
	public abstract Student getStudent(String student_rollNumber);
	
	public abstract boolean delete(String student_rollNumber);
	

}
