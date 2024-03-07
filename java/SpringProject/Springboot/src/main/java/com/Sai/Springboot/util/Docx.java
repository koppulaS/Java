package com.Sai.Springboot.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class Docx {

	public static ByteArrayInputStream generateWord()
			throws FileNotFoundException, IOException, InvalidFormatException {
			try (XWPFDocument doc = new XWPFDocument()) {



			XWPFParagraph p1 = doc.createParagraph();
			p1.setAlignment(ParagraphAlignment.CENTER);
			// Set Text to Bold and font size to 22 for first paragraph
			XWPFRun r1 = p1.createRun();
			r1.setBold(true);
			r1.setItalic(true);
			r1.setFontSize(22);
			r1.setText("Spring Boot from teja it");
			r1.setFontFamily("Courier");
			r1.setColor("008000");
			r1.addBreak();



			XWPFParagraph p2 = doc.createParagraph();
			// Set color for second paragraph
			XWPFRun r2 = p2.createRun();
			r2.setText("krishnas docx");
			r2.setColor("FF5733");
			r2.setEmbossed(true);
			r2.setStrikeThrough(true);
			r2.addBreak();
			r2.addBreak();



			XWPFParagraph p3 = doc.createParagraph();
			p3.setAlignment(ParagraphAlignment.CENTER);
			XWPFRun r3 = p3.createRun();
			r3.setBold(true);
			r3.setItalic(true);
			r3.setFontSize(22);
			r3.setText("batch");
			r3.setFontFamily("Arial");



			XWPFTable table = doc.createTable();
			// Creating first Row
			XWPFTableRow row1 = table.getRow(0);
			row1.getCell(0).setText("naidu, dev");
			row1.addNewTableCell().setText("charan, dev");
			row1.addNewTableCell().setText("king, bigdata");



			// Creating second Row
			XWPFTableRow row2 = table.createRow();
			row2.getCell(0).setText("prabha, dev");
			row2.getCell(1).setText("budha, op");
			row2.getCell(2).setText("dinarr, dev");



			ByteArrayOutputStream b = new ByteArrayOutputStream();
			doc.write(b);
			return new ByteArrayInputStream(b.toByteArray());
			}



			}
}
