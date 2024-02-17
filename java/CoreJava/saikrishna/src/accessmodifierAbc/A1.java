package accessmodifierAbc;   ///by using access modifiers(public) we can enter into one package to another package through import//
                             //default modifier we can access within the package but not outside the package//
                             //for private modifier we cannot create a class//
                             //for protected modifier we can access within the package but outside the package within subclass//
                             //we can use private modifier in methods but within the class//
                             //for protected modifier we cannot create a class//



 public class A1 {                   //public class//
	
	public String name="avengers";   //public variable//
	
	public void practise () {          //public method//
		System.out.println("super rangers=red redranger");
		
	}
	public static void main(String[] args) {
		A1 a= new A1();
		a.practise();
		System.out.println(a.name );
	}

}
