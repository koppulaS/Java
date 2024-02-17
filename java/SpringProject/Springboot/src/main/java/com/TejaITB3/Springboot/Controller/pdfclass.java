package com.TejaITB3.Springboot.Controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TejaITB3.Springboot.Model.Employee;
import com.TejaITB3.Springboot.Repository.EmployeeRepository;
import com.TejaITB3.Springboot.util.Pdfcreation;
@RestController
@RequestMapping("employee")

public class pdfclass {
	
	
	
	@Autowired
	EmployeeRepository employeeRepository;



	@GetMapping(value = "/employeedatapdf", produces =
	MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> employeeReport()
	throws IOException {
	List<Employee> employee = (List<Employee>)employeeRepository.findAll();

	ByteArrayInputStream bis = Pdfcreation.employeePDFReport(employee);



	HttpHeaders headers = new HttpHeaders();
	headers.add("Content-Disposition","inline;filename=employee.pdf");



	return ResponseEntity.ok().headers(headers).contentType
	(MediaType.APPLICATION_PDF)
	.body(new InputStreamResource(bis));
	}



	}

