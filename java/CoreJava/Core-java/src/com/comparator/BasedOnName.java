package com.comparator;

import java.util.Comparator;

public class BasedOnName implements Comparator <Pidilite> {

	@Override
	public int compare(Pidilite o1, Pidilite o2) {
		
		return o1.productname.compareTo(o2.productname);
	}

	

}
 