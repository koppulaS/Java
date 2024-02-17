package com.Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringExample {

	public static void main(String[] args) {
		List<Integer >  i = Arrays.asList(2,4,5,6,6,3,3,2,2,2,2);
		List<String> list=   Arrays.asList("saicharan","arjun","sai","veena","vamshi","srujan","sahara","saicharan","arjun","sai","veena");
		list.stream().filter(d->d.contains("r")).map(q->q.concat(" friends of charan")).forEach(System.out::println);
		list.stream().filter(f->f.startsWith("v")).forEach(System.out::println);
		list.stream().filter(e->e.endsWith("a")).map(q->q.concat(" ends with A")).forEach(System.out::println);
	
		  System.out.println("=============================");
		  
		  i.stream().distinct().forEach(System.out::println);
		  Set<Integer> kp = new HashSet<>();
		  kp.stream().filter(w->!kp.add(w)).forEach(System.out::println);
		  
	Boolean b=	list.stream().anyMatch(d->d.equals("sai"));
	System.out.println(b);
	  System.out.println("=============================");
	  
	// elemenst count
Long ll=	list.stream().count();
System.out.println(ll);
System.out.println("=============================");

// character occurance count
String n = "thiruvananthapuram";
  Long charcount=   n.chars().filter(k->k=='a').count();
  System.out.println(charcount);
  System.out.println("=============================");
  
  // list elemnt occurance count
  Long lkl= list.stream().filter(f->f.equals("charan")).count();
  System.out.println(lkl);
  System.out.println("=============================");
  
	// remove the duplicate String from list
   list.stream().distinct().forEach(System.out::println);
  System.out.println("=============================");
  
   // printing ommly duplicate values
   Set<String> set = new HashSet<String>();
   list.stream().filter(f->!set.add(f)).forEach(System.out::println);
  System.out.println("====================================================================");
  
  //character count excluding spaces in string
   String str ="live life king size";
 Long lng=  str.chars().filter(g-> g!=' ').count();// excluding spaces
 Long lngg=  str.chars().count();//including spaces
 System.out.println(lng);
 
 System.out.println("=========================================");
 String Fullname ="sai charan koppula";
 
 //split the String with spaces, reverse each word , joining with spaces
 String s = Arrays.asList(Fullname.split(" "))
            .stream()
            .map(q-> new StringBuffer(q).reverse())
            .collect(Collectors.joining(" "));
 System.out.println(s);
 
   
	}
}
