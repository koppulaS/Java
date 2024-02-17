package Kodi;

public class ChildofAb extends Abstract {

	 public ChildofAb (){
		 
	 }
	 @Override
	 public static void q () {
			System.out.println("nullify method");	
			}
	
	 public static void main(String[] args) {
		 ChildofAb ab = new ChildofAb();
		 ab.k();
		 ab.f(45, 78.1);
		 ChildofAb.q();
		 
		
	}
	 
}
