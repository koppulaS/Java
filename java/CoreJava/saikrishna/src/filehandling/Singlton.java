package filehandling;

public class Singlton {

	private static Singlton singlton;
	private Singlton() {
		
	}
	private static Singlton getInstance() {
		//1st time request
		if (singlton==null) {
			singlton=new Singlton();
		}
		//2nd time onwards
		return singlton;
		
	}
	@Override
	public String toString() {
		return "Singlton [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public static void main(String[] args) {
		System.out.println(singlton.getInstance());
		 Singlton s1=new  Singlton();
		 Singlton s2=new  Singlton();
		 Singlton s3=new  Singlton();
	}
	
	
	
}
