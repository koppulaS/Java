package com.Sai.Springboot.Model;//if we use @lombok(annotation)then we dont need to write @setter,@getter,@@AllArgsConstructor,@NoArgsConstructor 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Spring_employee22")
@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
	private Integer eid;
	private String firstname;
	private String lastname;
	private String fullname;
	private long salary;
	private Integer  age;
	
}
