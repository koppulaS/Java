package variables;        //this is child class of book my show//

public class paytm {
  
	public void pvr() {//    static  method which called from one class to another class=book my show to paytm//
		System.out.println(bookmyshow.name);
		
   	} public void shivaganga() {
   		System.out.println(bookmyshow.ticketprice1); //static variable we can call directly from one class to another class//
   		System.out.println(bookmyshow.ticketprice2); //instance variable we can't call directly from one class to another class//
   		
   	}
	                   
	public static void main(String[] args) {
		paytm ptm=new paytm();
		ptm.pvr();
		
		
		//then how to call instance variable from one class to another class//
		// by creating object of the parent class in child class given below//
        
        bookmyshow kkr=new bookmyshow();   //this  is parent class =bookmyshow 
        kkr.shivaganga();
		System.out.println(kkr.ticketprice);  //instance variable in parent class
		System.out.println(kkr.ticketprice2);
	}
	
	}

