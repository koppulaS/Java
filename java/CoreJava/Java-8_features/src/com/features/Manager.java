package com.features;

public interface Manager {
	
	default String role() {
		return"im manager";
	}

	public static String  leading(){
		
		return "YBL projecct";
	}
}
