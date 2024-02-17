package com.features;

public class Employee  implements Manager, Teamlead{

	@Override
	public String role() {
	
		return Manager.super.role();
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.role());
		System.out.println(Manager.leading());
		System.out.println(Teamlead.leading());
	
	}
	
}
