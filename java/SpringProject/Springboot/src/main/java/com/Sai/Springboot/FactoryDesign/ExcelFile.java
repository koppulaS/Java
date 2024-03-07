package com.Sai.Springboot.FactoryDesign;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Sai.Springboot.Model.Employee;

public class ExcelFile implements FileGenrton {

	@Override
	public void Genfile(List<Employee> empList, String folder) throws IOException {
		
		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet = workBook.createSheet("Person");
		XSSFRow row;
		row = sheet.createRow(0);
		row.createCell(0).setCellValue("Id");
		row.createCell(1).setCellValue("Name");
		row.createCell(2).setCellValue("Salary");
		int rowcount = 1;
		for (Employee person : empList) {
		row = sheet.createRow(rowcount);
		row.createCell(0).setCellValue(person.getEid());
		row.createCell(1).setCellValue(person.getFirstname());
		row.createCell(2).setCellValue(person.getSalary());
		rowcount++;
		}
		FileOutputStream fos = new FileOutputStream(folder+"employee.xlsx");
		workBook.write(fos);
		fos.close();
		
	}

}
