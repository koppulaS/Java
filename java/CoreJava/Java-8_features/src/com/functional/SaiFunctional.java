package com.functional;

@FunctionalInterface // contains 
public interface SaiFunctional {

	void student(String name);
	
	public static void main(String[] args) {
		SaiFunctional tf = new SaiFunctional() {
			// Anonymous inner class
			@Override
			public void student(String name) {
				System.out.println("student name "+name);
			}
		};
		
		tf.student("charan");
	}
	
}
