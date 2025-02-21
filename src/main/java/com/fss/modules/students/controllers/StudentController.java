package com.fss.modules.students.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fss.modules.students.models.Student;
import com.fss.modules.students.services.StudentRegister;
import com.fss.modules.students.services.StudentsList;


@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private final StudentsList studentsList;;

    @Autowired
    private final StudentRegister studentRegister;

    public StudentController (StudentsList studentsList, StudentRegister studentRegister){
        this.studentsList = studentsList;
        this.studentRegister = studentRegister;
    }

    @GetMapping("/")
    public List<Student> getStudent(){
        
        List<Student> students = studentsList.getStudents();

        return students;
    }
    

    @PostMapping("/register")
    public void createStudent(Student s){
        
        studentRegister.createStudent(s);

    }
}
