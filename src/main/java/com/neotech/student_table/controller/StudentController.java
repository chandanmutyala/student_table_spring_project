package com.neotech.student_table.controller;
//package com.neotech.student_table.model.StudentEntity;
import com.neotech.student_table.model.StudentEntity;
import com.neotech.student_table.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping(value = "/getStudents")
    public List<StudentEntity> getStudents(){
        return studentService.getStudents();
    }



}
