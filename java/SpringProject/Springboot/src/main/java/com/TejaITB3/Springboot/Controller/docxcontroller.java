package com.TejaITB3.Springboot.Controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TejaITB3.Springboot.util.Docx;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

@RestController
@RequestMapping("/worddoc99")

public class docxcontroller {

	
	@GetMapping(value = "/wordjum",
	produces = "application/vnd.openxmlformats-"
	+ "officedocument.wordprocessingml.document")
	public ResponseEntity<InputStreamResource> word()
	throws IOException, InvalidFormatException {



	ByteArrayInputStream bis = Docx.generateWord();
	HttpHeaders headers = new HttpHeaders();
	headers.add("Content-Disposition",
	"inline; filename=mydoc.docx");
	return ResponseEntity.ok().headers(headers).
	body(new InputStreamResource(bis));
	}
	}

