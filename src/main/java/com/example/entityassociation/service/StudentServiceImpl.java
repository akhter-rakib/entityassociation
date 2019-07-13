package com.example.entityassociation.service;

import com.example.entityassociation.model.oneToOne.Student;
import com.example.entityassociation.repository.StudentReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentReposity studentReposity;

    @Override
    public void saveStudent(Student student) {
        studentReposity.save(student);
    }
}
