package realtime;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;

public class create_PDF{ 
	
	
	
	   public static void main(String args[]) throws Exception {              
	      // Creating a PdfWriter       
	      String dest = "C:/itextExamples/sample.pdf";       
	      PdfWriter writer = new PdfWriter(); 
	   
	      // Creating a PdfDocument       
	      PdfDocument pdfDoc = new PdfDocument();              
	   
	      // Adding a new page 
	      pdfDoc.newPage();               
	   
	      // Creating a Document        
	      Document document = new Document();               
	   
	      // Closing the document    
	      document.close();              
	      System.out.println("PDF Created");    
	   } 
	} 
	

      