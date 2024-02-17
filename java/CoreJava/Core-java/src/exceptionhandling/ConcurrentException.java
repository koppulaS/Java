package exceptionhandling;

public class ConcurrentException {
    
	int id=88;
	String name="mumbai indians";
	
	public static void main(String[] args) {
		
		int i=88;
		int j=i;
		System.out.println(j);
		
		ConcurrentException srh1=new ConcurrentException();
		srh1.id=i;//we can assign value by using variable 
		
		//coping a variable=shallow copy
		
		ConcurrentException srh2=new ConcurrentException();
		srh2=srh1;//coping object=deep copy

	}

	
}
