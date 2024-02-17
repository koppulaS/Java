package com.TejaITB3.Springboot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TejaITB3.Springboot.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
       
	// this are custom repositories..
	 public List<Employee> findBySalary(Long salary); 
	 public List<Employee> findByFirstnameAndLastname(String fname,String lname);
	 public List<Employee> findByFirstnameOrLastname(String fname,String lname);
	 public List<Employee> findBySalaryLessThan(Long salary);
	 public List<Employee> findByLastnameLike( String lastname);
	 public List<Employee> findBysalaryBetween(Long Salary1,Long Salary2);
	 public List<Employee> findByageEquals(Integer Age);
	// public List<Employee> findAllByOrderByageDesc(Integer Age);
	 public Boolean existsByfirstname(String fname);

	  //   by using @Query we use our native queries..
}
