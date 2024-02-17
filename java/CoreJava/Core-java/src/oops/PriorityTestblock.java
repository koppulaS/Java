package oops;

public class PriorityTestblock {
	
	public PriorityTestblock(){//constructor method//
		
		//priority
		//1.static block//
		//2.instance block//
		//3.constructor//
		System.out.println("zero constructor");
	}
	{
		//instance block//
		System.out.println("instance block");
	}
	static {
		//static block//
		System.out.println("static block");
	}
	public static void main(String[] args) {
		PriorityTestblock p=new PriorityTestblock();
	}
}
