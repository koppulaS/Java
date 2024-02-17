package practise22;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sett {
   
	public static void main(String[] args) {
		
		Set<Integer> s=new LinkedHashSet<Integer>();
		
		  s.add(83);
		  s.add(445);
		  s.add(887);       
		  s.add(83);            //it doesn't allow duplicate values//
		 
		  
		  for(Integer i:s) {
			  System.out.println(i);
		  }
	}

	public void king() {
		// TODO Auto-generated method stub
		
	}
}
