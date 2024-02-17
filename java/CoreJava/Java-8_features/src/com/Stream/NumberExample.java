package com.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberExample {
	public static void main(String[] args) {
		
		// for printing the numbers in sequence
		//  "t" is like the refernce vlue in the foreach method
		IntStream.range(1, 51).forEach(t-> System.out.println(t)); 

		System.out.println("================================================");
		// for printing numbers parallel like asynchronously without sequence
		IntStream.range(6, 70).parallel().forEach(p -> System.out.println(p));
		System.out.println("====================================================================");
		                                                  //classname :: methodname
		IntStream.range(0, 25).filter(s->s%2==0).forEach(System.out::println);
		IntStream.range(0, 25).filter(s->s%2!=0).forEach(System.out::println);//  != (not equals symbol)
	System.out.println("=======================================================================");	
	List<Integer> lisst=	Arrays.asList(6,2,10,4,8,24,30,16,14);
	              lisst.stream()
	                   .filter(x -> x%2==0) // filter the data based on condition
	                   .map(x-> x*5) // to apply some condition
	                   .sorted() // sort the data
	                   .sorted(Comparator.reverseOrder())// sort the data in reverse order
	                   .skip(2) // skips the n number of elements
	                   .limit(3)// it will get limit of numbers
	                   .distinct()// wont allow duplicate values
	                   .forEach(System.out::println); /// iterating the data
	              System.out.println("===============================");
	              
	              // to itearte the data agaian we use the collect method with collectors class
	        List<Integer> distlist=lisst.stream().distinct().collect(Collectors.toList());
	                      distlist.stream().map(s->s*10).forEach(System.out::println);
	                      System.out.println("Aggregate functions"	);
	               Integer max=lisst.stream().max(Integer:: compare).get();
	               System.out.println("max number is "+max);
	               
	             Long count = lisst.stream().count();
	             System.out.println("the count is "+count);
	             
	            Integer sum = lisst.stream().mapToInt(x-> x+0).sum(); // x+0 is condition
	            System.out.println("sum is "+sum);
	          OptionalDouble avg=  lisst.stream().mapToInt(x-> x+0).average(); // x+0 is the condition 
	          System.out.println("avg is "+avg.getAsDouble());
	          
	         Optional<Integer> op = lisst.stream().findAny();
	         System.out.println("findany "+op);
	        Optional<Integer> opp= lisst.stream().findFirst()	;
	        System.out.println("first element "+opp);
	        
	       Boolean allmatch = lisst.stream().allMatch(x-> x<50);
	       System.out.println("allmatch .. "+allmatch);
	       
	       Boolean anyMatch = lisst.stream().anyMatch(x-> x==20);
	       System.out.println("anyMatch .. "+anyMatch);
	       
	       Boolean noneMatch = lisst.stream().noneMatch(x-> x==55);
	       System.out.println("noneMatch .. "+noneMatch);
	            
	                      
	        
	}

}
