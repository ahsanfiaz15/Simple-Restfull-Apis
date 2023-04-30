package com.firstbackendapis.services;

import java.util.List;

import com.firstbackendapis.model.Employee;

public interface EmployeeService {
   Employee saveEmployee(Employee employee);
   List<Employee> getAllEmploye();
   Employee getEmployee(long id);
   Employee updateEmployee(Employee employee,long id);
   void deleteEmployee(long id);
}
