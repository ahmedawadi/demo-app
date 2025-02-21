package com.fss.modules.students.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fss.modules.students.models.Student;
import com.fss.modules.students.repositories.StudentRepository;

@Service
public class StudentsList {
    @Autowired
    StudentRepository studentRepository;
    public StudentsList(){}

    public List<Student> getStudents(){

        return studentRepository.findAll();        
    }
}
