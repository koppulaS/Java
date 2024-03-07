package com.Sai.Springboot.Controller;
	
		import java.io.IOException;
		import java.text.DateFormat;
		import java.text.SimpleDateFormat;
		import java.util.Date;
		import java.util.List;
		import javax.servlet.http.HttpServletResponse;

		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.web.bind.annotation.GetMapping;
		import org.springframework.web.bind.annotation.RequestMapping;
		import org.springframework.web.bind.annotation.RestController;

import com.Sai.Springboot.Model.Employee;
import com.Sai.Springboot.Service.EmployeeService;
import com.Sai.Springboot.Service.ExcelService;
import com.Sai.Springboot.util.ExcelUtil;



	


		@RestController
		@RequestMapping(value="/employee")
		public class Excelcreation {

		@Autowired
		private ExcelService employeeService;


		@GetMapping("/excel")
		public void exportToExcel(HttpServletResponse response) throws IOException {
		response.setContentType("application/octet-stream");
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		String currentDateTime = dateFormatter.format(new Date());

		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=employee" + currentDateTime + ".xml";
		response.setHeader(headerKey, headerValue);

		List<Employee> listUsers =employeeService.listAll();

		ExcelUtil excelExporter = new ExcelUtil(listUsers);

		excelExporter.export(response);
		
		}

		}
	

