package exceptionhandling;     //it will disturb the normal flow of  the program//

public class ExceptExamples {

	public void Arithexcpt() {
		System.out.println("this is arithematic exception start...");
		
		try {
		int i=400;
		int val=i/0; //we got exception//   //something value /zero
		System.out.println(val);
		}catch(ArithmeticException e) {
			 e.printStackTrace();//it will print the exception type//
			 System.out.println("this is arth end");	 
		}
	}
	   public void arrIndexExecpt() {
		try {
		String[] names= {"pokemon","dragonballz","doremon",}; //
		System.out.println(names[3]);  //this print should be inside try block only
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	
	   }
		public void nullpointer() {
			
		
			System.out.println("this is null pointer...start");
			try {
			Integer i=null;
			Integer j=54;
			Integer k=i+j;
			System.out.println(k);      //here exception
			}catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("null ends");
			}
		
		System.out.println("this is null pointer end");
		
	}
		public void numberFormat() {  //when an attempt is made to convert string with improper format into numeric value//
			System.out.println("number format starts");
			try {
			String val="100abc"; 
			Integer data=Integer.valueOf(val);
			System.out.println(data);
			}catch(NumberFormatException e) {
				e.printStackTrace();
			
			System.out.println("number format ends");
			}
		}
	
	public static void main(String[] args) {
		ExceptExamples ee=new ExceptExamples();
		ee.Arithexcpt();
		ee.arrIndexExecpt();
		ee.nullpointer();
		ee.numberFormat();
	}
}