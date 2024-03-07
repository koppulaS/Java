package com.Sai.Springboot.FactoryDesign;

public class FileGenUtil {

	public static FileGenrton fileGeneration(String fileType) {
		FileGenrton fileGen=null;
		
		switch (fileType) {
		case "txt":
			fileGen=new TextFile();
			break;
			
		case "pdf":
			fileGen=new PdfFile();
			break;
			
		case "xlsx":
			fileGen=new ExcelFile();
			break;
			
		case "docx":
			fileGen=new WordFile();
			break;

		default:
			break;
		}
		return fileGen;
		
	}
}
