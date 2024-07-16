package com.te.sms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Student {
	@Id
	private String studentRollNumber;
	private String studentEmail;
	private String studentAge;
	private String studentUsername;
	private String studentPassword; 
	

}