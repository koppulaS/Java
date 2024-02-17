package Kodi;

public class overiding extends over{

	@Override
	public void hell() {
		System.out.println("hell overide");
	}

	@Override
	public void book() {
	System.out.println("book override");	
	}

	@Override
	public void cook(int i, double d, String s) {
		System.out.println(i +d + s);
		}

	@Override
	public void look(String s, String k) {
		System.out.println(s+k);
		
	}
public static void main(String[] args) {
	overiding or = new overiding();
	or.book();
	or.cook(45, 2.2, "shivv");
	or.look("jgfue", "jsdfgeru");
}
	
	}


