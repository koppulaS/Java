package com.TejaITB3.Springboot.FactoryDesign;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import com.TejaITB3.Springboot.Model.Employee;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfFile implements FileGenrton {

	@Override
	public void Genfile(List<Employee> empList, String folder) {
		try {
			Document pdfDocument = new Document();
			FileOutputStream pdffos = new FileOutputStream(folder+"\\employee.pdf");
			PdfWriter.getInstance(pdfDocument, pdffos);
			pdfDocument.open();

			for(Employee emp:empList){
			Paragraph ph = new Paragraph(emp.getEid()+"::"+emp.getFirstname()+"::"+emp.getSalary());
			pdfDocument.add(ph);
			}

			pdfDocument.close();
			pdffos.close();
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (DocumentException e) {
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			}
		
	}

}
