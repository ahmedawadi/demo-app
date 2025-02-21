package com.fss.modules.students.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fss.modules.students.models.Student;
import com.fss.modules.students.repositories.StudentRepository;

@Service
public class StudentRegister {
    @Autowired
    StudentRepository studentRepository;
    
    public void createStudent(Student s){
        studentRepository.save(s);
    }
}
