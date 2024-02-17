package com.TejaITB3.Springboot.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="orders_spring3")
@Data
public class Orders {

	@Id
	@GeneratedValue
int orderId;
String orderItem;
Integer applicationId;

}
