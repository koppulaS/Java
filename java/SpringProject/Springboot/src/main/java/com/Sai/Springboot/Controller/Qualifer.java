package com.Sai.Springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sai.Springboot.Service.EmpService;

@RestController
@RequestMapping("/Qualifertest")
public class Qualifer {
@Autowired
@Qualifier("Manager")
EmpService empservice;

@GetMapping("/desgn")
public String designationEmp() {
	String designation=empservice.designation();
	return designation;
	
}
}
