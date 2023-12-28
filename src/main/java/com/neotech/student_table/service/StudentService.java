package com.neotech.student_table.service;

import com.neotech.student_table.model.StudentEntity;
import com.neotech.student_table.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<StudentEntity> getStudents(){
        return studentRepository.findAll();
    }
}
