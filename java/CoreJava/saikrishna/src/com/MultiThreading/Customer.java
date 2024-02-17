package com.MultiThreading;

public class Customer {
  public static void main(String[] args) {
	  Customerimpl ct=new Customerimpl();
	  new Thread() {
		  
	  
		  @Override
		  public void run() {
			  try {
				   ct.withdraw(15000);
			  }catch(InterruptedException e) {
				  e.printStackTrace();
			  }
		  }
	  }.start();
	  new Thread() {
		  @Override
		  public void run() {
			   ct.deposit(10000);
		  }
	  
	  } .start(); 
	  

  }

	
	



	
	

}




