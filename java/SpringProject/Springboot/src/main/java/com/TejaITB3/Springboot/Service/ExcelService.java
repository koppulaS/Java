package com.TejaITB3.Springboot.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.TejaITB3.Springboot.Model.Employee;
import com.TejaITB3.Springboot.Repository.EmployeeRepository;



@Service
@Transactional
public class ExcelService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired EmployeeService employeeService;

	public List<Employee> listAll() {
	return employeeRepository.findAll(Sort.by("firstname").ascending());
	}

	}

