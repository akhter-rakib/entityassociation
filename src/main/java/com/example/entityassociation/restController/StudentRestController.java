package com.example.entityassociation.restController;

import com.example.entityassociation.model.oneToOne.Student;
import com.example.entityassociation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {
    @Autowired
    StudentService studentService;

    @PostMapping(value = "saveStudent")
    public void saveStudent(@RequestBody Student student) {
        System.out.println(student.toString());
        studentService.saveStudent(student);
    }

}
