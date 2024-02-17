package variables;

public class H2o {

	String name="saikrishna";//instance variable//stored in=heap area
	
	static long salary=36888;//static variable//method area
	
public static void main(String[] args) {
	int id=10;//local variable//main method //stored in stack area
	System.out.println(id);
	
	H2o kri=new H2o();
	System.out.println(kri.name);
	System.out.println(H2o.salary);
	System.out.println(salary);
	
	
}
}
