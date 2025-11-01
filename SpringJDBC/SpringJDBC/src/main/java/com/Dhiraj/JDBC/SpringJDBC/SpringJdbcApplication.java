package com.Dhiraj.JDBC.SpringJDBC;

import com.Dhiraj.JDBC.SpringJDBC.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.Dhiraj.JDBC.SpringJDBC.service.StudentSerivce;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringJdbcApplication.class, args);
		ApplicationContext context=SpringApplication.run(SpringJdbcApplication.class,args);
		Student s=context.getBean(Student.class);
		s.setMarks(75);
		s.setName("Yash");
		s.setRollNo(120);

		StudentSerivce service=context.getBean(StudentSerivce.class);

		service.addStudent(s);

		List<Student>std=service.getStudents();
		System.out.println(std);

	}

}
