package collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class IteratorWhile {
	
	public void listiteration() {
		
		List<String> l=new ArrayList<String>();
		l.add("discount");
		l.add("offer");
		l.add("cashback");
		l.add("coupon");
		
		Iterator<String> itr=l.iterator(); //Iterator=interface,  iterator=it iterates the value
		
    		while(itr.hasNext()) {      //  condition true //        hasNext()=check the condition whether value is present or not//
			String name=itr.next();  //next=it will return a value
			System.out.println(name);
			
		}
    		System.out.println("........");
	}
	
	
	   public void EnumerationData() {
		   Vector<String> vc=new Vector<String>();
		   
		   vc.add("abc");
		   vc.add("def");
		   vc.add("ghi");
		   //to iterate the legacy class data only
		   Enumeration<String> enumdata=Collections.enumeration(vc);
		   
		   while(enumdata.hasMoreElements()) {        //condition
			    String data=enumdata.nextElement();    //NextElement()=return the value
			    System.out.println(data);
		   }
		   
		   
	   }
	
       public static void main(String[] args) {
		IteratorWhile k=new IteratorWhile();
		k.listiteration();
		k.EnumerationData();
	}
}
