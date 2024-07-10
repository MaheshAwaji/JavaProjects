package com.te.springCore.constInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/te/SpringCore/constInject/configConst.xml");
		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);
	}

}
