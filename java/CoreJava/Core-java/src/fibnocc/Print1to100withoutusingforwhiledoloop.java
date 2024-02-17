package fibnocc;

//1.by using recursive function
//by using java streams
public class Print1to100withoutusingforwhiledoloop {

	public static void main(String[] args) {
		printnum(1);	
	}
	public static void printnum(int num) {
		if(num<=100) {
		System.out.println(num);
		num++;
		printnum(num);
	}
}
}