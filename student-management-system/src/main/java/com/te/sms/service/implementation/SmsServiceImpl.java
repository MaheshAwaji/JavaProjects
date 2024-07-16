package com.te.sms.service.implementation;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.te.sms.dto.LoginDto;
import com.te.sms.dto.StudentDto;
import com.te.sms.entity.Student;
import com.te.sms.repository.SmsRepository;
import com.te.sms.service.SmsService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SmsServiceImpl implements SmsService {

	private final SmsRepository smsRepository;

	@Override
	public boolean checkPassword(LoginDto loginDto) {
		Student student = smsRepository.getStudent(loginDto.getRollnumber());
		return student.getStudentPassword().equals(loginDto.getPassword());
	}

	@Override
	public String register(StudentDto studentDto) {
		Student student=new Student();
		
		BeanUtils.copyProperties(studentDto, student);
		return smsRepository.register(student);
	}

}
