package variables;

public class king {///////doubt
	
	public String taxCategory() {
		return "electrical";
	
	}
		
	public double taxPayer() {//return is not a variable this method is instance method//
		return 51.05;
	}
		
	public float miles() {//this is instance method//
		return 15.55f;
	}
	public String mobileCategory() {
		return "apple";
	}
	public byte itemid() {
		return 101;
	}
	public char grade() {
		return 65 ;
		
	}
	public static byte itemid1() {//this is static method//
		return 102;
		
		
	}
	public static float miles1() {
		return 10.1111f;
	}
	public double taxAmount() {
		return 1478.88;
	}
	public byte itemprice() {
		return 41;
	}
	public void gst() {
		System.out.println("this method wont return print anything...");
		double gstAmt=500;
		king taxData=new king();
		
	
		double principleamt=taxData.taxAmount();
		double totalAmount=principleamt+gstAmt;
		System.out.println(totalAmount);
	}
	public void ggst() {
		
		 king ttaxdata=new king();
		 
		byte cgstAmount=15;              //this is local variable because present inside method//
		byte itemprice=ttaxdata.itemprice();
		byte totalItemprice=(byte) (itemprice+cgstAmount);
		System.out.println(totalItemprice);
	
		

	}
	
	public static void main(String[] args) {
		king tax=new king();
		System.out.println(tax.taxAmount());
		tax.gst();
		
		
		System.out.println("name is king");
		System.out.println(tax.taxPayer());
		System.out.println(tax.miles());
		System.out.println(tax.mobileCategory());
		System.out.println(tax.itemid());
		System.out.println(tax.grade());
		System.out.println(itemid1());//we don't need tax. because it is a static method we can use it directly//
		
		
		//System.out.println(tax.nothing())
		tax.gst();
		tax.ggst();
		
		
		
	}
}
