package com.te.sms.service;

import com.te.sms.dto.LoginDto;
import com.te.sms.dto.StudentDto;

public interface SmsService {
	
	public abstract String register(StudentDto studentDto);
	public abstract boolean checkPassword(LoginDto loginDto);
	

}
