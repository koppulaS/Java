package com.features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import java.util.Set;

public class TimeApi {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
	LocalTime lt=	  LocalTime.now();
	System.out.println(lt);
	
	LocalDateTime ldt= LocalDateTime.now();
	System.out.println(ldt);
	
	
		System.out.println("=====================================");
		
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		System.out.println(LocalTime.now());
		
		
		
	System.out.println("===========================================");
	
 Set<String> zones =	ZoneId.getAvailableZoneIds();
 zones.stream().forEach(System.out::println);

 System.out.println("---------------");
	       LocalDateTime ldtz=   LocalDateTime.now(ZoneId.of("US/Pacific"));
	  LocalDateTime ldtzz=     LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
	System.out.println(ldtz);
	System.out.println(ldtzz);
	
	System.out.println("--------------------------------------------");
LocalDate lk=	LocalDate.of(2021, Month.MARCH, 32);
System.out.println(lk);
	// will gett DATETIMEexception as march 32 is not present 
		
	}
}
