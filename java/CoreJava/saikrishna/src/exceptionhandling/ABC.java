package exceptionhandling;

public class ABC implements Cloneable {
int id;

	public static void main(String[] args) throws CloneNotSupportedException {
		
		ABC k=new ABC();
		k.id=89;
		ABC l=new ABC();
		
		l=(ABC) k.clone(); //copy of object
		System.out.println(l.id);
	//when i used clone method to copy the object,class without implements	
	}

}
 