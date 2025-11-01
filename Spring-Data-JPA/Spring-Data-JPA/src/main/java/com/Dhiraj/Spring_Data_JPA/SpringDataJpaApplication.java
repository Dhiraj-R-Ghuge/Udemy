package com.Dhiraj.Spring_Data_JPA;

import com.Dhiraj.Spring_Data_JPA.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=	 SpringApplication.run(SpringDataJpaApplication.class, args);
		StudentRepo repo=context.getBean(StudentRepo.class);
		Student s1=context.getBean(Student.class);
		Student s2=context.getBean(Student.class);
		Student s3=context.getBean(Student.class);
//
//		s1.setRollNo(101);
//		s1.setName("Dhiraj");
//		s1.setMarks(85);
//
//		s2.setRollNo(102);
//		s2.setName("Bhavesh");
//		s2.setMarks(80);
//
//		s3.setRollNo(103);
//		s3.setName("Rajesh");
//		s3.setMarks(75);
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);
		System.out.println(repo.findByNameIgnoreCase("dhiraj"));
	}



}
