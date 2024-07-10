package com.te.reserve1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.reserve1.entity.Employee;


public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
    	AbstractApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
    	Employee employee1 = (Employee) context.getBean("employee1");
    	System.out.println(employee1);
    	//registering shutdownhook
    	context.registerShutdownHook();
    	
    }
}
