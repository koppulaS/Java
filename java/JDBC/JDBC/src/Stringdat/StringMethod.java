package Stringdat;

public class StringMethod {
public static void main(String[] args) {
	String s1="sai charan";
	s1=s1.concat(" koppula");
	System.out.println(s1);
	System.out.println(s1.charAt(9));
	System.out.println(s1.codePointAt(4));
	System.out.println(s1.contains("k"));
	System.out.println(s1.contentEquals("s"));
	System.out.println(s1.endsWith("a"));
	System.out.println(s1.length());
	
	
}
}
