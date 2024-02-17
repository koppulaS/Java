package com.TejaITB3.Springboot.FactoryDesign;

import java.io.IOException;
import java.util.List;

import com.TejaITB3.Springboot.Model.Employee;

public interface FileGenrton {

	public abstract void Genfile(List<Employee> empList,String folder) throws IOException;
}
