package com.te.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springCore.entity.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
    	Employee emp1 = (Employee) context.getBean("employee1");
    	System.out.println(emp1);
    	
    }
}
