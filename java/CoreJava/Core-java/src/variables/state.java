package variables;                     ///constructor concept///

public class state {
	
	String capitalofindia;
	String capitaloftelangana;
	String capitalofandhra;
	String capitalofmaharastra;
	
	public state() {//default constructor or zero argument constructor//      //which doesn't have return type ex:void,double,//
		
		System.out.println("this is constructor");
		
	}
	public state(String nameofcity) {//argument constructor 0r parameterized constructor//
		this.capitalofindia=nameofcity;
		System.out.println(nameofcity);
		
	}
	public state(String name1,String name2,String name3) {//argument constructor with multiple //
		this.capitaloftelangana=name1;
		this.capitalofandhra=name2;
		this.capitalofmaharastra=name3;
		System.out.println( name1);
	}
	
	public static void main(String[] args) {
		state srh=new state();
		state kx11=new state("delhi");
		state csk=new state("hyderabad","amaravathi","mumbai");
		System.out.println(csk);
	}
	@Override
	public String toString() {
		return "state [capitalofindia=" + capitalofindia + ", capitaloftelangana=" + capitaloftelangana
				+ ", capitalofandhra=" + capitalofandhra + ", capitalofmaharastra=" + capitalofmaharastra + "]";
	}
	
	
	
}
	
		
		
	


