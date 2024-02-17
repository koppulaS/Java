package Kodi;

public abstract class Abstract  {

	public Abstract() {
		
	}
	public abstract void s ();
	
	public void k () {
		System.out.println("abstract class");
	}
	public static void q () {
	System.out.println("static method");	
	}
	public void f (int i , double j ) {
		System.out.println("we can give parameted also");
		System.out.println(i +" "+j);
	}
	public static void main(String[] args) {
		/* Abstract a = new Abstract (); */ // we cannot create object so we need a child class
		
	}
}
