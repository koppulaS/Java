package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="waper")
public class Wallet {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Walletid;
	private double balance;
	
	@OneToOne
	@JoinColumn(name="fkcid")
	private Customer customer;
	public int getWalletid() {
		return Walletid;
	}
	public void setWalletid(int walletid) {
		Walletid = walletid;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Wallet [Walletid=" + Walletid + ", balance=" + balance + ", customer=" +  "]";
	}
	
	
	
}
