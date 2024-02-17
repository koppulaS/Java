package exceptionhandling;

public class Stackover {
 
	public void m1() {
		System.out.println("this is m1");
		m2();
	}
	public void m2() {
	 System.out.println("this is m2");
	m3();
	}
	public void m3() {
	System.out.println("this is m3");
	m1();
	}
	public static void main(String[] args) {
		Stackover ss=new Stackover();
		ss.m1();
	}
}
