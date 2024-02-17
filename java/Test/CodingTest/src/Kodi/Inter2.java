package Kodi;

public class Inter2 implements Inter {

	@Override
	public void g() {
		System.out.println(" we cannot implement in interface ");
		System.out.println("default static");
	}
public static  void f () {
	
	System.out.println();
}

public void assam () {
	super.i = 98;
	
	System.out.println(Inter.i);
}
public static void main(String[] args) {
	Inter2 in = new Inter2();
	in.assam();
	in.g();
}
@Override
public void k() {
	
	
}

}
