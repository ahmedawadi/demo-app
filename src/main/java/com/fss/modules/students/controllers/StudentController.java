package com.fss.modules.students.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fss.modules.students.models.Student;
import com.fss.modules.students.services.StudentService;


@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private final StudentService studentService;;

    public StudentController (StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/")
    public List<Student> getProduct(){
        
        List<Student> students = studentService.getStudents();

        return students;
    }
    
}
