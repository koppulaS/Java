package com.Stream;

import java.util.ArrayList;
import java.util.List;



public class EmployeeStreamTest {

	public static void main(String[] args) {
		List<EmployeeStream> list = new ArrayList<EmployeeStream>();
		list.add(new EmployeeStream("veeena", "nirmal", 99000L, "dev"));
		list.add(new EmployeeStream("saikrishnna", "nirmal", 98000L, "dev"));
		list.add(new EmployeeStream("sharath", "hyd", 85000L, "testing"));
		list.add(new EmployeeStream("narendra", "waranagal", 80000L, "testing"));
		list.add(new EmployeeStream("vamshi", "nirmal", 80000L, "testing"));
		
		list.stream()
                     .filter(h->h.getLocation().endsWith("l"))
		             .map(f->f.getName().concat("  friend of saicharan"))
		             .forEach(System.out::println); 
		//
	}
}
