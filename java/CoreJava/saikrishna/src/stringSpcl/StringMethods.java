package stringSpcl;

public class StringMethods {
       public static void main(String[] args) {
		
    	   String s1= "Teja";
    	s1= s1.concat("IT");
    	   
    	System.out.println(s1);
    	System.out.println(s1.charAt(1));
    	System.out.println(s1.contains("a"));
    	System.out.println(s1.endsWith("T"));
    	System.out.println(s1.startsWith("T"));
    	System.out.println(s1.equalsIgnoreCase("teja it"));
    	System.out.println(s1.length());
    	//System.out.println(s1.replace("T","j"));
    	System.out.println(s1.toUpperCase());
    	String s="thomson";
    	String[] splitvalues=s.split("o");
    	System.out.println(splitvalues[2]);
    	
    	
	}
}
