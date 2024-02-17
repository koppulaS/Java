package com.TejaIT.TestingProject.Integration;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.TejaIT.TestingProject.Model.Employee;
import com.TejaIT.TestingProject.Repository.EmployeeRepository;
import com.TejaIT.TestingProject.Service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class EmployeeControllerITTests {
	@Autowired
    private MockMvc mockMvc;

	/*
	 * @Autowired private EmployeeRepository employeeRepository;
	 */
    @Autowired
    private ObjectMapper objectMapper;
    
    @MockBean
	EmployeeService employeeService;
	/*
	 * @BeforeEach void setup(){ employeeRepository.deleteAll(); }
	 */

    @Test
    public void givenEmployeeObject_whenCreateEmployee_thenReturnSavedEmployee() throws Exception{

        // given - precondition or setup
        Employee employee = Employee.builder()
                .firstName("Teja")
                .lastName("Ch")
                .email("teja@gmail.com")
                .build();

        // when - action or behaviour that we are going test
        ResultActions response = mockMvc.perform(post("/api/employees")
               .contentType(MediaType.APPLICATION_JSON)
       .content(objectMapper.writeValueAsString(employee)));

        // then - verify the result or output using assert statements
        response.andDo(print()).
                andExpect(status().isCreated());
                /*.andExpect(jsonPath("$.firstName",
                        is(employee.getFirstName())))
                .andExpect(jsonPath("$.lastName",
                        is(employee.getLastName())))
                .andExpect(jsonPath("$.email",
                        is(employee.getEmail())));*/

    }
}
