package com.te.LearnJava8.java8Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LearnFilter {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Mahesh","Suresh","Rakesh","Ram","Sita");
		List<String> list2=list.stream().filter(name->name.startsWith("M")).collect(Collectors.toList());
		
		System.out.println(list2);
	}

}
