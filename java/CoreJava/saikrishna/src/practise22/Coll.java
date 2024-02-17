package practise22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Coll {
public static void main(String[] args) {
	
	 Collection<String> kk=new ArrayList<String>();
	 
	 kk.add("chudapa siddapa");
	 kk.add("kodute kotali ra six kotali");
	 kk.add("raa pellicheskundam");
	 
	 
	 for( String data:kk) {
		 System.out.println(data);
	 }
}
}
