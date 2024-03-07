package com.Sai.Springboot.FactoryDesign;

import java.io.IOException;
import java.util.List;

import com.Sai.Springboot.Model.Employee;

public interface FileGenrton {

	public abstract void Genfile(List<Employee> empList,String folder) throws IOException;
}
