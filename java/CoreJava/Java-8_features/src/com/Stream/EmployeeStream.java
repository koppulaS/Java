package com.Stream;

public class EmployeeStream{

	String name;
	String location;
	Long salary;
	String designation;
	
	
	
	public EmployeeStream(String name, String location, Long salary, String designation) {
		super();
		this.name = name;
		this.location = location;
		this.salary = salary;
		this.designation = designation;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
	
	
}
