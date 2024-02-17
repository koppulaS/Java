package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Itemdtls")
public class Items {

	@Id
	@GeneratedValue
	private int Itemid;
	private String itemName;
	
	
	@ManyToMany
	private List<Customer>customer;

	public int getItemid() {
		return Itemid;
	}

	public void setItemid(int itemid) {
		Itemid = itemid;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	
		
	
	
	
}
