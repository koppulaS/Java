package accessmodifierXyz;

import accessmodifierAbc.A1;      ///if we use star(*) in place of accessmodifierAbc.A1 we can import whole package///
import accessmodifierAbc.A2;
                                  ///we can also inheritance from one package to another package  by creating object where we extend that package//
public class B1 extends A2 {
	
	void object() {
		
	}
	
	public static void main(String[] args) {
		
		A1 a=new A1();
		a.practise();
		System.out.println(a.name);
		
		A2 a2= new A2();
		a2.ben10();
		
		B1 b=new B1();
		b.pokemon();
	}

}
