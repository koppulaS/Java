package accessmodifierAbc;     

public class  A2 {
	
       public void ben10() {
    	   System.out.println("this is ben10");
       }
       public void pokemon() {
    	   System.out.println("this is pokemon");
       }
       public static void main(String[] args) {
		A2 a2=new A2();
		a2.pokemon();
		
	A1 a=new A1();
	a.practise();
     System.out.println(a.name); 
       
       
       }
}
