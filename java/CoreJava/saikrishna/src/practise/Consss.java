package practise;

public class Consss {
int id;
String name;
long mobileno;
	 public Consss() {
		System.out.println("kkry"); 
	 }
	 public Consss(int orderid) {
		System.out.println(orderid);
	 }
	 public Consss(int webid,String product) {
		System.out.println(webid);
		System.out.println(product);
	 }
	 
	 public Consss(int id, String name, long mobileno) {
		super();
		this.id = id;
		this.name = name;
		this.mobileno = mobileno;
	}
	public static void main(String[] args) {
		 Consss oo=new Consss();
		 Consss ui=new Consss(1287999);
		 Consss yt=new Consss(90006543,"accer");
	
	}
	@Override
	public String toString() {
		return "Consss [id=" + id + ", name=" + name + ", mobileno=" + mobileno + "]";
	}
	
}
