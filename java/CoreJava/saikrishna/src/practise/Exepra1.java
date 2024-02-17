package practise;

public class Exepra1 {

	 public void m1() {
		System.out.println("this is start"); 
		try {
		int i=100/0;
		System.out.println(i);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("this ends");
	 }
	 public void m2() {
		 System.out.println("this is null pointer starts");
		 try {
		 Integer i=null;
		 int j=500;
		 int k=i+j;
		 System.out.println(k);
		 }catch(NullPointerException e) {
			 e.printStackTrace();
		 }
		 
		 System.out.println("this null ends");
		 
	 }
	 public void m3() {
		 System.out.println("this is array start");
		 try {
		String[] tiffins= {"idly","dosa","chutney"};
		System.out.println(tiffins[3]);
		 }catch(ArrayIndexOutOfBoundsException e) {
			 e.printStackTrace();
			 
		 }
		
		 
		
		System.out.println("this is array ends");
		
	 }
	 public void m4() {
		 System.out.println("this is number formatly");
		 try {
		 String name="abc123";
		 Integer f = Integer.valueOf(name);
		 System.out.println("this numbrr format ends");
		 }
		 catch(NumberFormatException n) {
			 n.printStackTrace();
			 System.out.println("caught");
		 }
	 
	 }
	 public static void main(String[] args) {
		Exepra1 k=new Exepra1();
		k.m1();
		k.m2();
		k.m3();
		k.m4();
	}
}
