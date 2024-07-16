package com.te.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class StudentDto {
	private String studentRollNumber;
	private String studentEmail;
	private String studentAge;
	private String studentUsername;
	private String studentPassword;

}
