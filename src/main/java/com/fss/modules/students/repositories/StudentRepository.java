package com.fss.modules.students.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import com.fss.modules.students.models.Student;

public class StudentRepository extends JpaRepository<Student, Long>    {
    
}
