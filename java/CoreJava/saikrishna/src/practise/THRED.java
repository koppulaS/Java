package practise;

import com.MultiThreading.Zomato;

public class THRED extends Thread {
	 public static synchronized void Data() { // void Data() {} //here why we took seperate method because if we take static in run method static method will not override  
			
		 for(int i=1;i<=5;i++) {
		     
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					
						e.printStackTrace();
					}
				
	    	 System.out.println("run method "+Thread.currentThread().getId());//running dead
	    	 System.out.println("run method2222 "+Thread.currentThread().getId());
	}
	
	}
	  

		  
	 
	
	  public  void run() {  //here  run method overriding from runnable interface to thread class and then Thread class to overriding to Zomato//
    	Data();              // run()=it acquires a lock...object level lock
      
	} 
     public static void main(String[] args) {
    	 THRED z1=new THRED ();
    	 Thread t1=new Thread(z1);//creating(born thread)     
    	 t1.start();//starting thread---//runnable state       //16
  
    
         	
	}

 
}

