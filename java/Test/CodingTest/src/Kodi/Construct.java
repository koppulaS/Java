package Kodi;

public class Construct {

	 public Construct() {
		 System.out.println("zero argumented");			
	 }
	 public Construct(int t , String dd) {
		 System.out.println("double arg");
		 System.out.println(t+dd);
	 }
	 public Construct (double g , String s, int f) {
		 System.out.println("triple rgumented");
		 System.out.println(g+s+f);
	 }
	 public static void main(String[] args) {
		 Construct c = new Construct();
		 Construct c1 = new Construct(10,"erj");
		 Construct c2 = new Construct(45.2 , "dd", 1);
	}
}
