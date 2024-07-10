package com.te.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springCore.collections.Student;
import com.te.springCore.reference.A;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext contextCollections =new ClassPathXmlApplicationContext("com/te/springCore/collections/collectionConfig.xml");
        ApplicationContext contextReference =new ClassPathXmlApplicationContext("com/te/springCore/reference/configRef.xml");
        Employee employee1=(Employee) context.getBean("employee1");
//        System.out.println(employee1);
        Employee employee2=(Employee) context.getBean("employee2");
//        System.out.println(employee2);
        Employee employee3=(Employee) context.getBean("employee3");
//        System.out.println(employee3);
        
        Student student1=(Student) contextCollections.getBean("student1");
//        System.out.println(student1.getStudentName());
//        System.out.println(student1.getAddresses());
//        System.out.println(student1.getSubjects());
//        System.out.println(student1.getMarklist());
        
        A a=(A) contextReference.getBean("aref");
        
        System.out.println(a.getY());
        System.out.println(a.getAb().getX());
        System.out.println(a);
    }
}
