 package flipkart;

public class invoice {
    double totalcost;
    double totalamount;
    double totalprice;
    
    public void billing() {
    	System.out.println("welcome to flipkart");
    	double fashionbill=fashion();
    	System.out.println("your fashion bill is.."+fashionbill);
    	System.out.println("thank you visit again..");
    	double mobilebill=mobile();
    	System.out.println("welcome to mobile store");
    	System.out.println("hurry up mobiles are on sale");
    	System.out.println("offers are avilable on diwali sale");
    	System.out.println("your mobile bill is=.."+mobilebill);
    }
    
	public double fashion() {
		double shirt=600.50;
		 double jeans=1500.70;
		double blazer=2000.60;
		totalcost=shirt+jeans+blazer;
		totalamount=gst(totalcost,categories.fashion);
		return totalamount;
	}
	
		public double mobile() {
		  double iphone= 12000;
		  double samsung=16500;
		  double oppo=14000;
		  totalcost=iphone+samsung+oppo;
		  totalamount=gst(totalcost,categories.mobile);
		  return totalamount;
		  
		}
	
	public double gst(double cost,String catg) {
		
		double gstamount;
		if(categories.fashion.equals("Fashion")) {
			gstamount=cost*0.18;
			totalprice=totalcost+gstamount;
			return totalprice;
			
	
			
		} else if(categories.mobile.equals("Mobile")){
			gstamount=cost*0.20;
			totalprice=totalcost+gstamount;
			return totalprice;
		}else {
			gstamount=cost*0.50;
			totalprice=totalcost+gstamount;
			return totalprice;
		}
		
			
		}
		
			
		
		
		
	
	public static void main(String[] args) {
		invoice typ=new invoice();
		typ.billing();
		
		
		
	}
	
}
