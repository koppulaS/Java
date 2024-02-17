package Stringdat;

public class StringData {

	
	public static void main(String[] args) {
		
		Address ad = new Address();
		ad.setCity("nirmal");
		ad.setState("TS");
		 
	Employe e = new Employe(52, "charan", ad);
	System.out.println(e);
	}	
	
}
