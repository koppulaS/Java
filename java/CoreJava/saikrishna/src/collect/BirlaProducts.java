package collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirlaProducts implements Comparable<BirlaProducts>  {
   
	
	@Override
	public String toString() {
		return "BirlaProducts [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
 

	int productId;
	String productName;
	int price;
	String username;
	
	
	
	public BirlaProducts(int productId, String productName, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	

 
	public static void main(String[] args) {
		
		BirlaProducts tp1=new BirlaProducts( 102,"zjsosod",355);
		BirlaProducts tp2=new BirlaProducts(100,"palt",889);
		BirlaProducts tp3=new BirlaProducts(378,"auyu",884);
		BirlaProducts tp4=new BirlaProducts(654,"ktyei",771);
		BirlaProducts tp5=new BirlaProducts(654,"truirri",7643);
		List<BirlaProducts> list=new ArrayList<BirlaProducts>();
		list.add(tp1);
		list.add(tp2);
		list.add(tp3);
		list.add(tp4);
		 list.add(tp5);
		 
		Collections.sort(list);
		for( BirlaProducts tp:list) {
		 System.out.println(tp);	
		}
	}



	@Override
	public int compareTo(BirlaProducts o) {
		
		return this.productId-o.productId;
		
		
		//@Override
		//public int compareTo(BirlaProducts o) {
			
		//	return this.productName.compareTo(o.productName);

		//      }
		
		}
		
	}

