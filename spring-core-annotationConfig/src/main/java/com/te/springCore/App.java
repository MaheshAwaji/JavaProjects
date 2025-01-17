package com.te.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springCore.entity.Employee;
import com.te.springCore.entity.JavaConfiguration;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfiguration.class);
    	Employee employee = context.getBean("emp", Employee.class);
    	System.out.println(employee);
    }
}
