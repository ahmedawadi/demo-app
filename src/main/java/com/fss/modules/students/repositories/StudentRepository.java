package com.fss.modules.students.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fss.modules.students.models.Student;

public interface StudentRepository extends JpaRepository<Student, String>    {
    
}
