 package stringSpcl;

public class StringTest {
      public static void main(String[] args) {
		
      String s="teja"; //String literals -> stored in SCP=string constant pool
      
      String s1=new String("teja");//String object->stored in heap memory
      
      
      String s3="teja";
      String s4="teja it java";
      String s5=new String("teja");
      String s6="teja";
      //=== it will compare objects  if the content is same but objects are stored in different memory then it is false.
      //
      
      System.out.println(s==s3);//true
      System.out.println(s==s6);//true
      System.out.println(s==s4);//false
      
      System.out.println(s==s5); //false
      System.out.println(s1==s5);//false
      
      //.equals it will compare content  if the content is same and objects are stored in different memory or same memory then it is true.
      System.out.println("========equals==========");
      System.out.println(s.equals(s3));//true
      System.out.println(s.equals(s6));//true
      System.out.println(s.equals(s4));//false
      System.out.println(s.equals(s5));//true
      System.out.println(s1.equals(s5));//true 
    	  
	}
}
