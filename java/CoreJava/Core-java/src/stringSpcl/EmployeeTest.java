package stringSpcl;

public class EmployeeTest {
public static void main(String[] args) {
	Address add= new Address();
	add.setCity("NIRMAL");
	add.setState("TELANAGANA");
	
	Employee e=new Employee(101,"krishnan",add);
	add.setCity("goa");
	System.out.println(e);
	
}
}
