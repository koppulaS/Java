package collect;                      //iterator only iterates collection objects//

import java.util.LinkedList;            // Iterator
import java.util.List;
import java.util.ListIterator;

public class Listiterat {
	
	public void listiterator() {
		
		List<String> i=new LinkedList<String>();
		
		i.add("manohar");
		i.add("hemanth");
		i.add("nagaraj");
		i.add("sai");
		
		ListIterator kkr=i.listIterator();
		//traverse the element in forward direction         //if we first iterator backward and then iterate  forward it will give 
		                                                      //  only forward values
		while(kkr.hasNext()) {
			  String name=(String) kkr.next();
			  System.out.println(name);
			
			   }
		
		System.out.println("............");
		//traverse the elements in backward direction//  
		while(kkr.hasPrevious()) {
	    	String name= (String) kkr.previous();	
	    			System.out.println(name);
		}	
		
	}
	
public static void main(String[] args) {
	Listiterat jk= new Listiterat();
	jk.listiterator();
}
}
