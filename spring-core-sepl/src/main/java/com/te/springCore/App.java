package com.te.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springCore.entity.Demo;
import com.te.springCore.entity.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
    	Demo demo1 = context.getBean("demo", Demo.class);
    	System.out.println(demo1);
    }
}