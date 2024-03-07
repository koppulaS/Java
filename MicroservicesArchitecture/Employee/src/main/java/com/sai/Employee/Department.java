package com.sai.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter

public class Department {
	private String Empname;
	private int EmpId;
	private long EmpSalary;
	
	public Department() {
		
	}
	
	
}
