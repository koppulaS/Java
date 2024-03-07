package com.Sai.Springboot.Service;

import org.springframework.stereotype.Service;

@Service("Manager")
public class Manager implements EmpService {

	@Override
	public String designation() {
		
		return" manager";
	}

	
}
