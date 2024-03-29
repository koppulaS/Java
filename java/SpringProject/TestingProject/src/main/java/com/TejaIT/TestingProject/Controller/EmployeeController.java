package com.TejaIT.TestingProject.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.TejaIT.TestingProject.Model.Employee;
import com.TejaIT.TestingProject.Service.EmployeeService;



@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	  private EmployeeService employeeService;

	    public EmployeeController(EmployeeService employeeService) {
	        this.employeeService = employeeService;
	    }

	    @PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    public Employee createEmployee(@RequestBody Employee employee){
	        return employeeService.saveEmployee(employee);
	    }

	    @GetMapping
	    public List<Employee> getAllEmployees(){
	        return employeeService.getAllEmployees();
	    }
}
