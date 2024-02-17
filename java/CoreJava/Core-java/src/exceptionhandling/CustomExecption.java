package exceptionhandling;

public class CustomExecption  {
     
	int balance=1000;
	int minamount=2000;
	
	public void balchecking() {
		if (balance>minamount) {
			System.out.println("please welcome to shopping");
		}else   {
			throw new InsufficientBalance("insufficient funds");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		CustomExecption ce=new CustomExecption();
		
		ce.balchecking();
		
	}
}
