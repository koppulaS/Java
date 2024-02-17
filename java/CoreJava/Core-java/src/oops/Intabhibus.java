package oops;                              //interface concept//

public class Intabhibus implements Intphonepay,Intdominos {  //interface is also called multiple  inheritance//

	
	//if we write override also it is correct but here in interface we doesnot perform any operation we give only declaration
	   // so we dont override
	
	public void busbooking() {    
		String from="vizag";
		String to="hyderabad";
		int cost=500;
		System.out.println("vizag to hyderabad ticket price ..."+cost);
		}
	public static void main(String[] args) {
		Intabhibus yy=new Intabhibus();//object creation for this class//
		yy.busbooking();
		yy.pizza();
		//we cannot create an object of interface//
	}
	
	public void pizza() {
		int price=650;
		
	System.out.println("cost of pizza is "+price);
		
		
	}
	}
 
	
	 

