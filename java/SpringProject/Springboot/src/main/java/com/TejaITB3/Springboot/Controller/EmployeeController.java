package com.TejaITB3.Springboot.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.TejaITB3.Springboot.FactoryDesign.FactoryDesignPattern;
import com.TejaITB3.Springboot.Globalexception.UserNotAvailableException;
import com.TejaITB3.Springboot.Model.Employee;
import com.TejaITB3.Springboot.Service.EmployeeService;

@RestController
@RequestMapping("/employee")    //class level mapping //employee=model package employee class..
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();	
	}
	@RequestMapping(value="/saveEmp",method=RequestMethod.POST) //method level mapping //saveEmployee refers="/saveEmp for reference we can take any value
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		Employee emp=empService.saveEmployee(employee);
		ResponseEntity<Employee> kk=new ResponseEntity<Employee>(HttpStatus.CREATED);
		return kk;
		}
	@RequestMapping(value="/updateEmp",method=RequestMethod.PUT)
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		       Employee emp=empService.updateEmployee(employee);
		       return new ResponseEntity<Employee>(HttpStatus.OK);
		       }
	@RequestMapping(value="/getByEmpId/{eid}",method=RequestMethod.GET)
	public ResponseEntity<Optional<Employee>>getByEmployeeId(@PathVariable Integer eid){
	Optional<Employee>emp=empService.getEmployeeById(eid);
		return new ResponseEntity<Optional<Employee>>(emp,HttpStatus.OK);
		
	}
	@RequestMapping(value="/getall",method=RequestMethod.GET)
	 public ResponseEntity<List<Employee>>getAll(){
		 List<Employee> listemp=empService.getAllEmps();
		 return new ResponseEntity<List<Employee>>(listemp,HttpStatus.OK);
		 
	 }
	
	@RequestMapping(value="/getsalry/{salary}",method=RequestMethod.GET)
	public ResponseEntity<List<Employee>> findbysaly(@PathVariable Long salary){
		
		List<Employee> lit=empService.findbysalry(salary);
		return new ResponseEntity<List<Employee>>(lit,HttpStatus.OK);
	}
	
	@RequestMapping(value="/getAndname/{fname}/{lname}",method=RequestMethod.GET)
	 public ResponseEntity<List<Employee>> findname(@PathVariable String fname,@PathVariable  String lname){
	   List<Employee> njk=empService.findstuname(fname,lname);
			   return new ResponseEntity<List<Employee>>(njk,HttpStatus.OK);   
	 }
	
	@RequestMapping(value="/getorname/{fname}/{lname}",method=RequestMethod.GET)
	 public ResponseEntity<List<Employee>> findorname(@PathVariable String fname,@PathVariable  String lname){
	   List<Employee> kkk=empService.findone(fname,lname);
			   return new ResponseEntity<List<Employee>>(kkk,HttpStatus.OK);   
	 }
	@RequestMapping(value="/getlessthan/{salary}",method=RequestMethod.GET)
	public ResponseEntity<List<Employee>> findlaythan(@PathVariable Long salary){
		   List<Employee> nnn=empService.findlessthan(salary);
				   return new ResponseEntity<List<Employee>>(nnn,HttpStatus.OK);   
		 }
	@RequestMapping(value="/getlike/{lastname}",method=RequestMethod.GET)
	public ResponseEntity<List<Employee>> findlike(@PathVariable String lastname ){
		   List<Employee> nnn=empService.findlike(lastname);
				   return new ResponseEntity<List<Employee>>(nnn,HttpStatus.OK);   
		 }
	@RequestMapping(value="/getbetween/{Salary1}/{Salary2}",method=RequestMethod.GET)
	public ResponseEntity<List<Employee>> findbetw(@PathVariable Long Salary1,@PathVariable Long Salary2 ){
		   List<Employee> nnn=empService.findbetween( Salary1, Salary2);
				   return new ResponseEntity<List<Employee>>(nnn,HttpStatus.OK);   
		 }
	
	@RequestMapping(value="/getequals/{Age}",method=RequestMethod.GET)
	public ResponseEntity<List<Employee>> findaga(@PathVariable Integer Age ){
		   List<Employee> rsp=empService.findagee(Age);
				   return new ResponseEntity<List<Employee>>(rsp,HttpStatus.OK);   
		 }
	
	//@RequestMapping(value="/getorderby/{Age}",method=RequestMethod.GET)
	//public ResponseEntity<List<Employee>> orderbyy(@RequestBody Integer Age ){
		 //  List<Employee> rsp=empService. findorder(Age);
				//   return new ResponseEntity<List<Employee>>(rsp,HttpStatus.OK);   
	
	@RequestMapping(value="/pagination",method=RequestMethod.GET)
	public Page<Employee> pagination(@RequestParam(defaultValue="0")Integer pagenum,@RequestParam(defaultValue = "3")Integer pagesize){
		
		Page<Employee> pageEmp=empService.paginationEmp(pagenum, pagesize);
		return pageEmp;
		
	}
	@GetMapping(value="/userAvaialabilitys")
	public ResponseEntity<Boolean> userAvaialabilty(@RequestParam String fname){
		Boolean userAvaialability=empService.userAvailability(fname);
		if(userAvaialability==false) {
			throw new UserNotAvailableException();
		}
		return new ResponseEntity<Boolean>(userAvaialability,HttpStatus.ACCEPTED);
		
	}
	@GetMapping("/restTemplatee")
	public String restTemplateTest() {
		RestTemplate restTemplate=new RestTemplate();
		String template=restTemplate.getForObject("http://localhost:9090/rest", String.class);
		template=template.concat("after adding rest ajdhahjkdj");
		
		return template;
	} 
	@GetMapping("/factoryDesign/{types}")
	public ResponseEntity<Object> factoryDesign(@PathVariable String types) throws IOException{
		String folder="D:\\factorydesign11\\";
		FactoryDesignPattern fdpattern=new FactoryDesignPattern(types);
		List<Employee> listEmp=empService.getAllEmps();
		fdpattern.executecommnds(listEmp,folder);
		
		return new ResponseEntity<Object>(HttpStatus.CREATED);
	}
			
		 }
	
 
