package com.te.springCore.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.te.springCore")//When you are using @Component for creating bean then you have to use this
public class JavaConfiguration {
	
	
	@Bean
	public Address getAddress() {
		return new Address();
	}
	
	
	//if you want give name to your bean instead of using getEmployee you have to use name="" or name={"",""} attribute
	@Bean(name ="emp")//@componentScan is not necessary when using @Bean
	public Employee getEmployee() {
		return new Employee(getAddress());
	}
	
	

}
