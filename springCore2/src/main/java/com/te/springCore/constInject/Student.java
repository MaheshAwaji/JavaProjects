package com.te.springCore.constInject;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
	private int rollNumber;
	private String studentName;
	private Certificate certi;

}
