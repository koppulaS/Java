package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pidilite implements Comparable<Pidilite> {
	
	int id;
	String productname;
	int price;
	
	
	
	
      public Pidilite(int id, String productname, int price) {
		super();
		this.id = id;
		this.productname = productname;
		this.price = price;
	}




	public static void main(String[] args) {
    	  Pidilite k1=new Pidilite(105,"m-seal",667);
    	  Pidilite k2=new Pidilite(107,"fevicol",887);
    	  Pidilite k3=new Pidilite(76,"gum",665);
    	  Pidilite k4=new Pidilite(34,"tree gum",88);
    	 
    	  List< Pidilite> kist=new ArrayList< Pidilite>();
    	  kist.add(k1);
    	 kist.add(k2);
    	 kist.add(k3);
    	  kist.add(k4);
    	  
    	  Collections.sort(kist,new BasedOnPrice());
    	  for(Pidilite pd:kist) {
    		 System.out.println(pd); 
    	  }
    	  System.out.println("===============");
    	  Collections.sort(kist,new BasedOnName());
    	  for(Pidilite pd:kist) {
    		 System.out.println(pd); 
    	  }
    	  System.out.println("================= ");
    	  
    	  Collections.sort(kist,new BasedOnid());
    	  for(Pidilite pd:kist) {
    		 System.out.println(pd); 
    	  }
    	  
	}




	@Override
	public String toString() {
		return "Pidilite [id=" + id + ", productname=" + productname + ", price=" + price + "]";
	}




	@Override
	public int compareTo(Pidilite o) {
		
		return 0;
	}
	       
}
