package com.features;

public class DataTest {

	public void name(String name) {
		System.out.println("String");
	}
	
	public void name(StringBuilder name) {
		System.out.println("String Builder");
	}
	public void name(StringBuffer name) {
		System.out.println("String Bufffer");
	}
	public static void main(String[] args) {
		DataTest dt = new DataTest();
	//	dt.name(null); // gives ambiguity problem
		dt.name("St");
StringBuffer sb = new StringBuffer("buffer");
dt.name(sb);
StringBuilder su = new StringBuilder("builder");
dt.name(su);


	}
}
