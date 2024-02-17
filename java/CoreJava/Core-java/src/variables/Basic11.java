package variables;



public class Basic11 {
	int i=10; //instance variable//
	int j=67;//instance variable//
	int k=i+j;//instance variable//

	static double n=100; //static variable//


		public void zetspeed() {  //instance method//
		
			byte i=10;    //local variable
			byte j=20;    //local variable
			byte k=(byte)(i+j);    //local variable
			System.out.println(k); //print statement is necessary for the program//
		}
		   static void zetspeed1() { //static method//
			double i=26;
			double j=78;
			double m=i+j;
			System.out.println(m);
		}
		
		public static void main(String[] args) { //main method//
			Basic11 b =new Basic11(); //object creation for instance method//
			
			b.zetspeed();  //here we are calling instance method//                         variablename.methodname
			Basic11.zetspeed1(); //here we are calling static method//                       classname.methodname
		System.out.println(n);//here we are  calling static variable
			
			
		}
		
	}


