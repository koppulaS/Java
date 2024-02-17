package com.TejaITB3.Springboot.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.TejaITB3.Springboot.Model.Employee;
import com.TejaITB3.Springboot.Repository.EmployeeRepository;

@Service
public class EmployeeService {
     
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee){ //Employee refer model class employee
	
		String fname=employee.getFirstname();
	  String lname=employee.getLastname();
		String fullname = fname.concat(" "+lname);
		  employee.setFullname(fullname);
       	Employee emp=employeeRepository.save(employee);
		return emp; 
	}
	
	public Employee updateEmployee(Employee employee) {
		 Employee emp=employeeRepository.save(employee);
		 return emp;
		
	}
	public Optional<Employee> getEmployeeById(Integer eid){
		Optional<Employee> emp=employeeRepository.findById(eid);
		return emp;
	}
	
	public Page<Employee> paginationEmp(Integer pagenum,Integer pageSize) {
		PageRequest page=PageRequest.of(pagenum, pageSize);
		Page<Employee> pageEmp=employeeRepository.findAll(page);
		return pageEmp ;
		
	}
	public List<Employee> getAllEmps (){
	List<Employee> listemp=employeeRepository.findAll();
	return listemp;
		
	}
	public List<Employee> findbysalry(Long salary){
	List<Employee> lik=	employeeRepository.findBySalary(salary);//we can return the value direct also in place of List<Employee>
	return lik;
	}
	
	public List<Employee> findstuname(String fname,String lname){
	List<Employee> nsk=employeeRepository.findByFirstnameAndLastname(fname,lname);
		return nsk;
		
	}
	
	public List<Employee> findone(String fname,String lname){
		List<Employee> rpk=employeeRepository.findByFirstnameOrLastname(fname,lname);
			return rpk;
			
		}
	
	public List<Employee> findlessthan(Long salary){
		List<Employee> trf=employeeRepository.findBySalaryLessThan(salary);
			return trf;
			
		}
	
	public List<Employee> findlike(String lastname){
		List<Employee> rrr=employeeRepository.findByLastnameLike(lastname);
			return rrr;
			
		}
	
	public List<Employee> findbetween(Long Salary1,Long Salary2){
		List<Employee> rrr=employeeRepository. findBysalaryBetween(Salary1,Salary2);
			return rrr;
			
		}
	public List<Employee> findagee(Integer Age){
		List<Employee> rrp=employeeRepository.findByageEquals(Age);
			return rrp;
			
		}
//	public List<Employee> findorder( Integer Age){
	//	return employeeRepository.findAllByOrderByageDesc(Age);
		
			
	//	}

	public  List<Employee> listAll() {
		
		return employeeRepository.findAll() ;
		}

	public Boolean userAvailability(String fname) {
		
		Boolean user=employeeRepository.existsByfirstname(fname);
		return user;
	} 
			
		
	}

