package com.features;

import java.util.Optional;

public class OptionalTest {

	
	public static void main(String[] args) {
		String val = null;
		
		/*
		 * if(val!= null) { val.toLowerCase(); } System.out.println(val);
		 */
		Optional<String> optString = Optional.empty();
		System.out.println(optString);
		
		optString= optString.ofNullable(val);
		System.out.println(optString.isPresent()); // true
	//	System.out.println(optString.get()); // to get the value
		System.out.println(optString.orElse("Software Engineer").toUpperCase());
		System.out.println(optString.orElseThrow(()-> new RuntimeException("no data available")));
	//	System.out.println(optString.orElseThrow(RuntimeException :: new));
	}
}
