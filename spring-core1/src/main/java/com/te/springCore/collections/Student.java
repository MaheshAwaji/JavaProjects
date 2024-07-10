package com.te.springCore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Student {
	private String studentName;
	private List<String> subjects;
	private Set<String> addresses;
	private Map<String, Integer> marklist;
	

}
