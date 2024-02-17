package com.comparator;

import java.util.Comparator;

public class BasedOnid implements Comparator <Pidilite>  {

	@Override
	public int compare(Pidilite o1, Pidilite o2) {
		
		return o1.id-o2.id;
	}

}
