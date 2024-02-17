package Kodi;

public class Overloading {

	int i ;
	String s ;
	public void sys() {
		System.out.println("zero");
	}
	public void sys(int i, String g , double d) {
		System.out.println("3 parametered ");
		System.out.println(i+g+d);
		
	}
	public void sys(int i ,double d , String s) {
		System.out.println("different order");
		System.out.println(i+d+s);
	}
	public void sys(String f) {
		System.out.println("single arg method");
		System.out.println(f);
	}
	public static void main(String[] args) {
		Overloading ol = new Overloading();
		ol.sys();
		ol.sys("qq");
		ol.sys(78, 21, "fffff");
		ol.sys(45	, null, 789.02);
	}
	
}
