package model;         //object relational mapping//

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customerb3")
public class Customer {
	
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private String name;
	private Date createDate;
	//for connecting two tables we use cascade..
	@OneToOne(mappedBy="customer",cascade=CascadeType.ALL)
	private Wallet wallet;
	
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
	private Set<Orders> orders;
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="customer_items_b3",
	joinColumns= {@JoinColumn(name="cid")},
	inverseJoinColumns= {@JoinColumn(name="itemId")})
	private List<Items> items;
	

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public Set<Orders> getOrders() {
		return orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	
	
	
	
	
}
