package com.TejaITB3.Springboot.FactoryDesign;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.TejaITB3.Springboot.Model.Employee;

public class FactoryDesignPattern {
    
	List<FileGenrton> commands=new ArrayList<FileGenrton>();
	//txt,pdf,xlsx,docx
	//String Types="txt,pdf,xlsx,docx"
	public FactoryDesignPattern(String Types) {
		
		String[] files=Types.split(",");
		
		for(String file:files) {
			//txt
			//pdf
			//xlsx
			//docx
		  FileGenrton filegenrton=FileGenUtil.fileGeneration(file);
		commands.add(filegenrton);
		
	}
}
	public void executecommnds(List<Employee> listEmp,String folder) throws IOException {
	for(FileGenrton filegen:commands) {
		filegen.Genfile(listEmp, folder);
	}
}
}