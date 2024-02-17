package com.Stream;

public class PrintNumWithOutLoop {
	private static void printData(int i) {
		System.out.println(i);
		if(i<21) {
			printData(i+1);
		}
	}
	
	public static void main(String[] args) {
		
		 printData(15);
	}

	
}
