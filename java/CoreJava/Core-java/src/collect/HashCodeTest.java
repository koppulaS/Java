package collect;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashCodeTest {

	  public static void main(String[] args) {
		
		  Map<String,String> k=new LinkedHashMap<String,String>();
		  
		  k.put("pokemon","ballz");
		  k.put("dragon","chanchu");
		  k.put("doremon","keypat");
		  for(Entry<String,String>cappeak:k.entrySet()) {
			  System.out.println(cappeak);
		  }
	}
}
