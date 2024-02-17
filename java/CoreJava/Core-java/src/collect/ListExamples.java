package collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListExamples {
	
     public static void main(String[] args) {
    	 
    	 //declaring the arraylist with 
        List<Integer> b1=new CopyOnWriteArrayList<Integer>(); //<>=generic means same type value it print//
    	 
    	 b1.add(0);
    	 b1.add(56);
    	 b1.add(67);
    	 b1.add(88);
    	 b1.add(78);
    	 b1.add(77);
    	
    	 b1.add(9);
    	 b1.add(99);
    	 b1.add(87);
    	 b1.add(3);
    	 b1.add(333);
    	 
    	b1.remove(4); 
         b1.get(2);
    	b1.set(2, 100000);  //updating element in the list//
    	 
    	 for(int i:b1) { //int=particular datatype we are referring only that accepts,i=value,b1=reference//
    		 b1.add(91);
    		 System.out.println(i);
    		 
    	 }
    	 ArrayList<String> c1=new ArrayList<String>();
    	 
    	 c1.add("n");
    	 c1.add("a");
    	 c1.add("k");
    	 c1.remove(1);
    	 
    	 for(String name:c1) {
    		 System.out.println(name);
    	 }
    	 
    	 
    	 LinkedList<Integer> lik=new LinkedList<>();
    	  lik.add(667);
    	  lik.add(897);
    	  lik.add(234);
    	  System.out.println(lik);
    	  for( int i:lik) {
    		  System.out.println(i);  
    	  }
    	  
     }

	
	}		 
    		 
     
    	 
	