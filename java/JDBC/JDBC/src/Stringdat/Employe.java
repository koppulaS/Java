package Stringdat;

public class Employe {
	
	// Employe is an immutable class
	
	private final Integer id ;
	private final String name;
	private final Address addres;
	
	public Employe(Integer id, String name, Address addres) {
		super();
		this.id = id;
		this.name = name;

		Address ad = new Address();
		ad.setCity(addres.getCity());
		ad.setState(addres.getState());
		this.addres = ad;
			}
	public Address getAddres() {
		return addres;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", addres=" + addres + "]";
	}

}
	


