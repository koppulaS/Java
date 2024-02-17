package com.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class FunExample {

	public static void main(String[] args) {
		// consumer interface
		Consumer<Integer> con = t -> System.out.println("value is "+t);
		con.accept(69);
	
		//supply interface
Supplier<String> sup = ()-> "sai charan";
String data = sup.get();
System.out.println(data);
 
    //predicate interface
Predicate<String> pre = t -> t.equals("sai") ;
Boolean val = pre.test("charan");
Boolean v= pre.test("sai");
System.out.println(val);
System.out.println(v);

// function interface
Function<Integer, String> f = tx-> "charan";
String sf= f.apply(69);
System.out.println(sf);


	}	
}
