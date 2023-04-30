package com.firstbackendapis.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.firstbackendapis.exception.ResourceNotFound;
import com.firstbackendapis.model.Employee;
import com.firstbackendapis.repostory.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}



	@Override
	public List<Employee> getAllEmploye() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}



	@Override
	public Employee getEmployee(long id) {
		// TODO Auto-generated method stub
		/*
		 * Optional<Employee> employee= employeeRepository.findById(id);
		 * if(employee.isPresent()) { return employee.get(); } else { throw new
		 * ResourceNotFound("Employee ","id",id); }
		 */
		
		return employeeRepository.findById(id).orElseThrow(()->new ResourceNotFound("Employee ","id",id));
	}



	@Override
	public Employee updateEmployee(Employee employee, long id) {
		// TODO Auto-generated method stub
	Employee emp=	 employeeRepository.findById(id).orElseThrow(()->new ResourceNotFound("Employee ","id",id));
	
	 emp.setFirstName(employee.getFirstName());
	 emp.setLastName(employee.getLastName());
	 emp.setEmail(employee.getEmail());
	 employeeRepository.save(emp);
	 return emp;
	}



	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		employeeRepository.findById(id).orElseThrow(()->new ResourceNotFound("Employee ","id",id));
	    employeeRepository.deleteById(id); 
	}

}
