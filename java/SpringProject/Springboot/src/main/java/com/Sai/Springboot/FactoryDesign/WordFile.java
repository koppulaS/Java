package com.Sai.Springboot.FactoryDesign;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import com.Sai.Springboot.Model.Employee;

public class WordFile implements FileGenrton  {

	@Override
	public void Genfile(List<Employee> empList, String folder) throws IOException {
		XWPFDocument document = new XWPFDocument();
		XWPFTable table = document.createTable();
		boolean isFirstime=true;
		for (Employee emp : empList) {
		XWPFTableRow row =null;
		if(isFirstime){
		row = table.getRow(0);
		row.getCell(0).setText(emp.getEid()+"");
		row.addNewTableCell().setText(emp.getFirstname()+"");
		row.addNewTableCell().setText(emp.getSalary()+"");
		isFirstime=false;
		}else{
		row=table.createRow();
		row.getCell(0).setText(emp.getEid()+"");
		row.getCell(1).setText(emp.getFirstname()+"");
		row.getCell(2).setText(emp.getSalary()+"");
		}

		XWPFParagraph paraGraph = document.createParagraph();
		XWPFRun run = paraGraph.createRun();
		run.setText(emp.getEid()+"::"+emp.getFirstname()+"::"+emp.getSalary());
		}

		FileOutputStream wordfos = new FileOutputStream(folder+"employee.docx");
		document.write(wordfos);
		wordfos.close();
	
}
}