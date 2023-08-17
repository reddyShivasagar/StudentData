package com.web.StudentData.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.StudentData.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
