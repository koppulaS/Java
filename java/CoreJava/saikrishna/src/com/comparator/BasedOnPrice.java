package com.comparator;

import java.util.Comparator;

public class BasedOnPrice implements Comparator <Pidilite>  {

	@Override
	public int compare(Pidilite o1, Pidilite o2) {
	
		return o1.price-o2.price;
	}


	}

	
	


