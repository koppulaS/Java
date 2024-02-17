package com.TejaITB3.Springboot.Service;


import org.springframework.stereotype.Service;

@Service("teamlead")
public class Teamlead implements EmpService {

	@Override
	public String designation() {
		
		return "Teamlead";
	}


	
}	

