package com.comparable;    //by using collections we will compare//

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TataProducts implements Comparable<TataProducts> {
    
	private int Productid;
	private String ProductName;
	private long ProductPrice;
	public TataProducts(int productid, String productName, long productPrice) {
		super();
		Productid = productid;
		ProductName = productName;
		ProductPrice = productPrice;
	}
	
	 public static void main(String[] args) {
		
		 TataProducts t1=new TataProducts(101,"nova",365);
		 TataProducts t2=new TataProducts(102,"head and shoulders",198);
		 TataProducts t3=new TataProducts(109,"dove",678);
		 TataProducts t4=new TataProducts(103,"archer",78);
		 
		 List<TataProducts> kk=new ArrayList<TataProducts>();
		 kk.add(t1);
		 kk.add(t2);
		 kk.add(t3);
		 kk.add(t4);
		Collections.sort(kk);
		for(TataProducts tp:kk) {
		System.out.println(tp);
		}
	}

	@Override
	public String toString() {
		return "TataProducts [Productid=" + Productid + ", ProductName=" + ProductName + ", ProductPrice="
				+ ProductPrice + "]";
	}

	@Override
	public int compareTo(TataProducts o) {
		
		return this.ProductName.compareTo(o.ProductName);
	}
	

	
	 
}

