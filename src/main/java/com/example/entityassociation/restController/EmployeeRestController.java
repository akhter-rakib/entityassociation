package com.example.entityassociation.restController;

import com.example.entityassociation.model.oneToMany.Employee;
import com.example.entityassociation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "saveEmployee")
    public void saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
    }
}
