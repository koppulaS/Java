package Kodi;

public class meythods {
	
	public void hh () {
		System.out.println("instamcce method");
	}

	public static void jj () {
		System.out.println("static method");
	}
	
	public void v (int j , String s, double d) {
		System.out.println(j);
		System.out.println(s);
		System.out.println(d);
	}
	public static void main(String[] args) {
		meythods m = new meythods();
		m.hh();
		meythods.jj();
		m.v(45, "die", 15);
	}
}
