package com.TejaIT.TestingProject.Service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.TejaIT.TestingProject.Model.Employee;
import com.TejaIT.TestingProject.Repository.EmployeeRepository;
import com.TejaIT.TestingProject.ServiceImpl.EmployeeServiceImpl;


@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTests {
	@Mock
	EmployeeRepository employeeRepository;
	
	@InjectMocks
	EmployeeServiceImpl employeeService;
	
	Employee employee;
	
	@BeforeEach
	public void setup() {
		employee=Employee.builder()
		        .id(1L)
		        .email("Tej@gmail.com")
		        .firstName("Teja")
		        .lastName("ch").build();
	}
	
	@Test
	public void givenEmployeeObject_whenSave_thenEmployee() throws Exception{
		// given
		//BDDMockito.given(employeeRepository.findByEmail(employee.getEmail())) .willReturn(Optional.empty());
		BDDMockito.given(employeeRepository.save(employee)).willReturn(employee);
		// when
		Employee saveEmp=employeeRepository.save(employee);
		// then
		Assertions.assertThat(saveEmp).isNotNull();
		Assertions.assertThat(saveEmp.getId()).isGreaterThan(0);
	}
}
