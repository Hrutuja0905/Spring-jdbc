package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entity.StudentDau;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program Started.........!" );
     
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        StudentDau studentDau = context.getBean("studentdau",StudentDau.class);
        
        student student = new student();
        
        student.setId(5);
        student.setName("vaishali");
        student.setAddress("Pune");
        
        int insert= studentDau.insert(student);
        
        System.out.println("Inserted"+insert);
        
        
    }
}
