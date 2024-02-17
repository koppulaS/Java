package stringSpcl;

public class StringReverse {
       public static void main(String[] args) {
		String str="CRICKET";
		
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
	}
}
 