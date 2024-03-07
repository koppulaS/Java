package com.Sai.Springboot.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Table(name="wallet_springb3")
@Data
public class Wallet {

	@Id
	@GeneratedValue
	int wid;
	double amount;
	Integer applicationId;
}
