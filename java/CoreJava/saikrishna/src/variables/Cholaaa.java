package variables;
                                                 //ARRAY CONCEPT//
public class Cholaaa {
    String[] products={"saikrishna","rajinikanth"}; //instance variable
    double [] gaps= {76.7,78.9,45.6}; //instance variable
    
	public static void main(String[] args) {
		int[] ticket= {46,76,90}; //local variable
		Cholaaa k=new Cholaaa();
		
		System.out.println(ticket[0]);
		System.out.println(ticket[1]);
		System.out.println(k.products[1]);
		System.out.println(k.gaps[2]);
		
	}
}
