package com.TejaITB3.Springboot.FactoryDesign;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.TejaITB3.Springboot.Model.Employee;

public class TextFile implements FileGenrton{

	@Override
	public void Genfile(List<Employee> empList, String folder) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(folder+"employee.txt"));

		for(Employee emp:empList) {
		writer.write(emp.getEid()+" "+emp.getFirstname()+" "+emp.getSalary());
		writer.newLine();
		}
		writer.close();
		
	}

}
