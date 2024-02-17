package variables;

public class bookmyshow {///class
	int ticketprice=50;//instance variable
	 int ticketprice1=90;//instance variable//            ///these 2 instance variables present inside class but outside method///
	static String name="bheemlanayak";//static variable
     short ticketprice2=170;
	 public void pvr() {
		System.out.println(ticketprice);//
	}
	public void imax() {
		System.out.println("imax+ticketprice");
	}
	public void shivaganga() {
		
		System.out.println(ticketprice1);
	}
	public void natraj() {//method
		short ticketprice2=170;//local variable because present inside the method//
		System.out.println(ticketprice2);
	
		System.out.println(bookmyshow.name);
	}
	
	
	public static void main(String[] args) {
		bookmyshow kkr=new bookmyshow();
		System.out.println(name);
		System.out.println(name);
		System.out.println(kkr.ticketprice);
		System.out.println(kkr.ticketprice2);
		
		kkr.pvr();
		kkr.imax();
		kkr.shivaganga();
		kkr.natraj();
		
	}
    
}
