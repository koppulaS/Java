package accessmodifierAbc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsList {
    public static void main(String[] args) {
		List<Integer> arr=new ArrayList();
		arr.add(67);
		arr.add(91);
		arr.add(65);
		arr.add(45);
		
		  Object[] arrData=arr.toArray();
		  
		  for(Object obj:arrData) {
		 System.out.println(obj);
		  }
	List<Object> li=Arrays.asList(arrData);
	
	for(Object obj:li){
	System.out.println(obj);	
	}
	}
}
