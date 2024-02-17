package collect;

import java.util.HashSet;
import java.util.Set;

public class BB {
	
	
public static void main(String[] args) {
	
	Set<Integer> set=new HashSet<Integer>();
	set.add(76);
	set.add(88);
	set.add(66);
	set.add(88);
	
	for(Integer i:set) {
		System.out.println(i);
	}
}
}
