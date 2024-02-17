package variables;
 
public class amazonprime {
	
	

	public void seatcat(String memcat) {
		if(memcat.equals("gold")) {//true 
			System.out.println("This is gold seat cat");
		}else if(memcat.equals("diamond")) {
			System.out.println("this is diamond cat");
		}else if(memcat.equals("silver")) {
			System.out.println("this is silver");
		}
		else {//if above all conditions false
			System.out.println("this is general category");
		}

	}
	public static void main(String[] args) {
		amazonprime net=new amazonprime();
		net.seatcat("silver");
		net.seatcat("gold");
		net.seatcat("diamond");
	}
}
