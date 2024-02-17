package com.TejaIT.TestingProject.Service;

import java.util.List;

import com.TejaIT.TestingProject.Model.Employee;


public interface EmployeeService {
	  Employee saveEmployee(Employee employee);
	    List<Employee> getAllEmployees();
}
