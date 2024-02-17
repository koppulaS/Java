package com.features;

public class FinallyTest {

public void test() {
	try {
	int i = 0;
	int j = 200;
	int k = j/i;
	System.out.println(k);
	}catch(Exception e) {
		System.out.println("catch block");
	}
	finally {
		System.exit(0);// to stop the printing of final block or to terminate the program floe after that
		System.out.println("finally block");
	}
}	
	public static void main(String[] args) {
		FinallyTest ft = new FinallyTest();
	ft.test();	
	}
	
	
}
