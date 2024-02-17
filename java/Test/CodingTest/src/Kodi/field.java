package Kodi;

public class field {
	int i ;
	String name;
	double d ;
	public field(int i, String name, double d) {
		super();
		this.i = i;
		this.name = name;
		this.d = d;
	}
	public field(String name, double d) {
		super();
		this.name = name;
		this.d = d;
	}
	public field() {
		System.out.println("zero");
	}
	public static void main(String[] args) {
		field f = new field();
		field f1= new field("q", 4);
		field f2 = new field(45, "fhg", 86);
	}
	@Override
	public String toString() {
		return "field [i=54" + i + ", name=gfgf" + name + ", d=78" + d + "]";
	}

}
