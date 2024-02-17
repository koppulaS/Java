package oops;

public abstract  class AbsBse {//abstract class allows both concrete methods and non concrete methods//
                              //interface allows only non concrete methods//
                              
	                          //object creation is not possible in abstract class//
	                          // class to class =extends,interface to class=implements// ==THIS WE CALL AS ABSTRACTION
	
	
	public void stockdetails() {
		System.out.println("Hdfc,Nestle,Coalindia,Tatamotors");
		
	}
	public   void stockupdates() {            // method body=concrete method//   or NON ABSTRACT METHODS
		System.out.println("hdfc=0.25,nestle=1.02,coalindia=2.56");
	}
	public abstract void brockerage();  ///declaration=non concrete method// or ABSTRACT METHOD
	
	public static void main(String[] args) {
		
	}

}
