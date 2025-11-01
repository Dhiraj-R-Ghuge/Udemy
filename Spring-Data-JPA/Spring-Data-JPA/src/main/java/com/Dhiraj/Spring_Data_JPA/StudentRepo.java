package com.Dhiraj.Spring_Data_JPA;

import com.Dhiraj.Spring_Data_JPA.model.Student;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface StudentRepo  extends JpaRepository<Student,Integer> {
    @Query("select s from Student  s where s.name ILIKE ?1")
    List<Student> findByNameIgnoreCase(String name);
    List<Student> findBy(int marks);
}
