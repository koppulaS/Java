package collect;


import java.util.Stack;


public class Stac {

	  public void stack() {
		 Stack<Integer> ro=new Stack<Integer>();
		  
		  ro.push(78);
		  ro.push(77);
		  ro.push(678);
		 ro.pop();
		 System.out.println(ro.peek());
		   for(int Data:ro) {
			  System.out.println(Data);
		  }
		  
		
	  }
	  public static void main(String[] args) {
		Stac jo=new Stac();
		jo.stack();
	}
}
