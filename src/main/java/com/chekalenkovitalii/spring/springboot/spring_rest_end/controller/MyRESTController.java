package com.chekalenkovitalii.spring.springboot.spring_rest_end.controller;


import com.chekalenkovitalii.spring.springboot.spring_rest_end.entity.Employee;
import com.chekalenkovitalii.spring.springboot.spring_rest_end.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployees = employeeService.getAllEmployees();

        return allEmployees;
    }

    @RequestMapping("/error")
    public String Error(){

        return "срань";

    }


    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) throws NoSuchFieldException {

        Employee employee = employeeService.getEmployee(id);


        return employee;

    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee){

        employeeService.saveEmployee(employee);

        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){

        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id){

        Employee employee = employeeService.getEmployee(id);

        employeeService.deleteEmployee(id);
        return "Employee with id = " + id + " was deleted";

    }

}
