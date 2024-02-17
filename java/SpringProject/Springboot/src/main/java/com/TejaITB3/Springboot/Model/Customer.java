package com.TejaITB3.Springboot.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="customer_springb3")
@Data
public class Customer {

	@Id
	@GeneratedValue
	int cid;
	String name;
	Integer applicationId;
	
}
