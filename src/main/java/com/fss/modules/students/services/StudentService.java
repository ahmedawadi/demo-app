package com.fss.modules.students.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fss.modules.students.models.Student;

@Service
public class StudentService {
    public StudentService(){}

    public List<Student> getStudents(){
        List<Student> students = new ArrayList<Student>();
        LocalDate birthDate = LocalDate.of(2002, 7, 3);

        students.add(new Student("ahmed", "awedi", 18, birthDate));
        
        return students;
    }
}
