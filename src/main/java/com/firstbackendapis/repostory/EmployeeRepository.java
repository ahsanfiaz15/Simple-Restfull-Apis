package com.firstbackendapis.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstbackendapis.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
