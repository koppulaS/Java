package com.TejaIT.TestingProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TejaIT.TestingProject.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Optional<Employee> findByEmail(String email);
}
