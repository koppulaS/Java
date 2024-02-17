package com.MultiThreading;

public class Zomato extends Thread {
	
	 public static synchronized void Data() { // void Data() {} //here why we took seperate method because if we take static in run method static method will not override  
	
		 for(int i=1;i<=15;i++) {
		        try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	    	 System.out.println("run method "+Thread.currentThread().getId());//running dead		
	}
	
	}
	
	  @Override
	public  void run() {  //here  run method overriding from runnable interface to thread class and then Thread class to overriding to Zomato//
    	                                        // run()=it acquires a lock...object level lock
   
	} 
     public static void main(String[] args) {
    	 Zomato z1=new  Zomato();
    	 Thread t1=new Thread(z1);//creating(born thread)     
    	 t1.start();//starting thread---//runnable state       //16
    //	 Thread  t2=new Thread(z1);
    //	 t2.start();                                            //17
    	
    	 
    //	 Zomato z2=new  Zomato();
    //	 Thread t3= new  Thread (z2);
   // 	 t3.start();                                          //19
    //	 Thread t4=new Thread (z2);
    //	 t4.start();                                          //20
    	 
    	
	}
}
 