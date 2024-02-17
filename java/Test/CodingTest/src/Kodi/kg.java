package Kodi;

public class kg extends Supercls {
static String g = "kiran";	//static variable
double gg= 78;
int ii;  // instance variables
String ss;
long l = 867984546531l;

 public void f() {
	 double gg = 45;//local variable
	 int ii = 78;
	 System.out.println(super.ii); 
	 System.out.println(kg.g);
	 System.out.println(this.gg );
	 System.out.println(gg);
 }
	
public void b() {
	char c = 'a';
	long l = 23546516491346l;
	System.out.println(this.l);
	System.out.println(l);
	System.out.println(c);
}
public static void main(String[] args) {
	kg p = new kg();
p.f();
p.b();
	
}
}
