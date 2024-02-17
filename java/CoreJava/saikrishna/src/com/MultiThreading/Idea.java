package com.MultiThreading;      //basic of thread class//

public class Idea extends Thread  {
	
	
	public  void kanam() {
		for(int j=1;j<=20;j++) {
			System.out.println(j);
		}
	}
	@Override
	public void run() {  
		//System.out.println("run method is executed by jvm");
		
		kanam();
		// 3.running//
		//try {
		//	Thread.sleep(500);   //waiting state
	//	}catch(InterruptedException e) {   //runtime exception
		//	e.printStackTrace();
		//}
	//	System.out.println("run method");
		} //4.dead//
	
   public static void main(String[] args) {
	Idea i=new Idea();
	Thread t1=new Thread(i); //1.born stage//
	t1.start(); //2.runnable//
	Thread t2=new Thread(i);
	t2.start();
	
	  //by this there came exception because threading dead so we cannot it operate it once again so there came exception 
	                            //Illegal thread state exception// 
}
}
