package com.TejaIT.TestingProject.Controller;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;

import com.TejaIT.TestingProject.Model.Employee;
import com.TejaIT.TestingProject.Service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest
public class EmployeeControllerTests {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	EmployeeService employeeService;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@Test
	public void given_when_then() throws Exception {
		// given
		Employee employee=Employee.builder()
		        .id(1L)
		        .email("Teja@gmail.com")
		        .firstName("Teja")
		        .lastName("ch").build();
		
		// when
		ResultActions rs=mockMvc.perform(post("/api/employees")
				.contentType("application/json")
		.content(objectMapper.writeValueAsString(employee)));
		       
		// then
		rs.andExpectAll(status().isCreated());
	}
}
