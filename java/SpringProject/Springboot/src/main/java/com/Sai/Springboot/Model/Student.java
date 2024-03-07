package com.Sai.Springboot.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="/Studntdtls")
@Setter
@Getter
@Data
public class Student {

	@Id
	@GeneratedValue
	private Integer cid;
	private String firstname;
	private String lastname;
	private String fullname;
	private long salary;
	
}