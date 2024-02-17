package exceptionhandling;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentExc {
	
	
    public static void main(String[] args) {
    	List<String> name=new ArrayList<String>();
    	//Set<String> ttp=new CopyOnWriteArraySet<String>();
    	
    	
    	
    	Map<String,String> kak=new ConcurrentHashMap<String,String>();
    	
    	kak.put("sai","nirmal" );
    	kak.put("vipul","vizag");
    	kak.put("avinash","banglore");
    	kak.put("rohit","cricket");
    	
    	for(Entry<String,String>data:kak.entrySet()) {
    		kak.put("nobita", "doremon");
    		System.out.println(data.getKey()+"..."+data.getValue());
    		
    	}
			
		}
		
	}

