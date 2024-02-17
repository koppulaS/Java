package oops;

public class  Parent extends Grandparent  {
	
	public void car() {
		System.out.println("this is parent car");
	
	}
	public void gold() {
		System.out.println("this parent gold");
	}
public static void main(String[] args) {
	 Parent pk=new Parent();
	 pk.car();
	 pk.gold();
	 pk.stick();
	 pk.cycle();
}
}
