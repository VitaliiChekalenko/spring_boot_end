package com.chekalenkovitalii.spring.springboot.spring_rest_end.service;


import com.chekalenkovitalii.spring.springboot.spring_rest_end.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void  saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
