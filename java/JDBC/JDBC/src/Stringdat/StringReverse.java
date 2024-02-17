package Stringdat;

//strng in reverse printing 
public class StringReverse {
	public static void main(String[] args) {
		String s = "String reverse operation";
		String rev = "  ";
		for (int i =s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
	System.out.println(rev);
	}

}
