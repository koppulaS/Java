package collect;

import java.util.Vector;

public class Vecto {
	
	public void vect() {
		Vector<Integer> ll=new Vector<Integer>();
		ll.add(23);
		ll.add(900);
		ll.add(980);
		for(int llData:ll) {
			System.out.println(llData);
		}
		
	}
	
	
   public static void main(String[] args) {
	
	   Vecto nm=new Vecto();
	   nm.vect();
	 
}
}
