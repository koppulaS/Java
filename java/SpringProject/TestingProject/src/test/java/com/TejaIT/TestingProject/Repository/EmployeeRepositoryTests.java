package com.TejaIT.TestingProject.Repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.TejaIT.TestingProject.Model.Employee;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class EmployeeRepositoryTests {
	@Autowired
	EmployeeRepository employeeRepository;
	
	Employee employee=null;

	// BDD style
	@Test
	public void givenEmployeeObject_whenSave_thenReturnEmployee() {
		// given condition
		Employee employee=Employee.builder()
				          .id(1L)
				          .email("Teja@gmail.com")
				          .firstName("Teja")
				          .lastName("Ch").build();
		//when -> Action
		Employee employee2=employeeRepository.save(employee);
		//then -> return or verifying output	
		Assertions.assertThat(employee2).isNotNull();
		Assertions.assertThat(employee2.getId()).isGreaterThan(0);
				          
	}

}
