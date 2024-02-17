package com.Stream;

public class ThreadJava8Test {
public static void main(String[] args) {
	
	
	Runnable run1= ( )->{
	
		for(int i = 0;i <11;i++) {
			System.out.println(i);
		}
	};
	
	
	Thread tt = new Thread(run1);
	tt.start();
}
}
