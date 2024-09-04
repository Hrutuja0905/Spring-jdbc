package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.entity.PersonDau;

public class TestPerson {
	
	public static void main(String[] args) {
		
		System.out.println("My program Starte..!!!");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		
		PersonDau personDau = context.getBean("persondau",PersonDau.class);
		
		
		//Update query
		
//		Person person = new Person();
	
//		person.setId(1);
//		person.setName("Hrutuja Salpure");
//		person.setContact("9604896843");
//		
//		int result = personDau.update(person);
//		
//		
//		System.out.println("inserted"+result);
		
		
		//Delete query
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter id you want to delete : ");
//		
//		int id = scanner.nextInt();
//		
//		int result = personDau.delete(id);
//		
//		System.out.println("Deleted Successfully "+result);
		
		
		//Select  query
		
//		Person person = personDau.getPerson(1) ;
//		
//		System.out.println(person);
		
//		Sekect multiple query
		
		
		List<Person> persons = personDau.getallPerson();
		
		for(Person p:persons) {
			System.out.println(p);
		}
		
	
	}

}
