package com.TejaITB3.Springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.TejaITB3.Springboot.Model.Employee;
@Controller
@RequestMapping("/ctrltest")
public class Controllerr {

	@GetMapping("/gettest")
	public @ResponseBody Employee getEmployeedata() {
		Employee employee=new Employee(102,"saikrishna","naid","saikrishnanaid",80000L,25);
		return employee;
	}
}
