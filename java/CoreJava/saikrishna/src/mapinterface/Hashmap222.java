package mapinterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap222 {
	

		 public void kolkan() {
			   Map<String,Integer> kkr=new HashMap<String, Integer>();     //entity object=collection of objects..
			    kkr.put("namibia", 567);
        	    kkr.put("thoeppe", 90);
        	    kkr.put("lkota", 420);   
        	    for(Entry<String,Integer>  mapData:kkr.entrySet()) {            //by using for method //=iterating the data
           			System.out.println(mapData.getKey()+"   "+mapData.getValue());
		 }
		
			}
		 public static void main(String[] args) {
				Hashmap222 nm=new Hashmap222();
				nm.kolkan();
			
		}

}
		
		
	
		
	

