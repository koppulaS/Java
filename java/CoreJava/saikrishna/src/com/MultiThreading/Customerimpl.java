package com.MultiThreading;

public class Customerimpl {

	 int amount=10000;
	 public  void withdraw(int amount) throws InterruptedException {
		 System.out.println("customer came to withdraw");
		 if(this.amount<amount) {
			 System.out.println("dont have enough balance please wait");
		  	
			 
		 }
		 this.amount=this.amount-amount;
		 System.out.println("withdraw completed");
		 
	 }
	 public void deposit(int amount) {
		 System.out.println("came for deposit......");
		 this.amount=this.amount+amount;
		 System.out.println("deposit completed");
		 
		
	 }
	
	
	}

