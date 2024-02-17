package mapinterface;                        //it follows insertion order

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maptesting {
           public void sources() {
        	   Map<String,Integer> chat=new LinkedHashMap<String, Integer>();
        	    chat.put("gelebi", 567);
        	    chat.put("samosa", 90);
        	    chat.put("dosa", 420);
      Iterator<Entry<String,Integer>> mapdata1=chat.entrySet().iterator(); //by using iterator method// =iterating the data
        	    
        	   while(mapdata1.hasNext()) {                                //by using while method// =iterating the data
        		   Entry<String,Integer> ent=mapdata1.next();
        		   System.out.println(ent.getKey()+"  "+ent.getValue());  
        	   }
           }
           public void hunt() {
        	   Map<Integer,String> map=new LinkedHashMap<Integer, String>();
       		map.put(1, "Datapack");
       		map.put(2, "razorpay");
       		map.put(3, "key");
       		
       		for(Entry<Integer,String>  mapData:map.entrySet()) {            //by using for method //=iterating the data
       			System.out.println(mapData.getKey()+"   "+mapData.getValue());
       			
       		}   
           }
	public static void main(String[] args) {
	
			Maptesting p=new Maptesting();
			p.sources();
			p.hunt();  
			
			
		}
		
	}

