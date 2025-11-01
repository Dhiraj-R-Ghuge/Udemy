package com.Dhiraj.JDBC.SpringJDBC.service;

import com.Dhiraj.JDBC.SpringJDBC.model.Student;
//import org.springframework.stereotype.Component;
import com.Dhiraj.JDBC.SpringJDBC.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentSerivce {

    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    private StudentRepo repo;

    public void addStudent(Student s) {
        repo.save(s);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
