package practise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Connn {

	public void kaka() {
		Map<String,String> kk=new ConcurrentHashMap<String,String>();
		
		kk.put("fghjkiu","hhhyffff");
		kk.put("tyyuik", "kkkjjjjjjj");
		
		for( Entry<String,String>Data:kk.entrySet()) {
			
			kk.put("koli","goli");
			System.out.println(Data.getKey()+"......."+Data.getValue());
		}
		
	}
	public static void main(String[] args) {
		Connn nm=new Connn();
		nm.kaka();
	}
	
}
