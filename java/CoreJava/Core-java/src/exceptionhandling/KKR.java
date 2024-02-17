package exceptionhandling;

public class KKR {
      public void data() {
    	  
    	  try {
    		  int i=100/0;
    		System.out.println("try block");
    		
    	  }catch (ArithmeticException e) {
    		 System.out.println("arth catch block"); 
    		 e.printStackTrace();
    	  }
    	  catch(NumberFormatException e) {
    		  e.printStackTrace();
    	  }
    	  catch(Exception e) {
    		  System.out.println("throwable catch");
    		  e.printStackTrace();
    	  }
    	  
      }
           public int data1() {
        	   try {
        		   int i=100/0;
        		   System.out.println("try block");
        		   return 15;
        	   }catch(ArithmeticException e) {
        		   System.out.println("catch block");
        		   e.printStackTrace();
        		   return 54;
        		  
        	   }
        	   finally {
        		   System.out.println("finally");
        		   return 98;
        	   }
           }
           
           
           
           
           
      public static void main(String[] args) {
		KKR j=new KKR();
		j.data();
		System.out.println(j.data1());
	}
      }

