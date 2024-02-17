package stringSpcl;
 //custom immutable class//
public final class Employee {
    private final Integer id;
    private final String name;
    private final Address address;
	
    
	
	public Employee(Integer id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	}
	
    
     

