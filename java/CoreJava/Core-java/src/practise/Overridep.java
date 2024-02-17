package practise;

public class Overridep extends Overriding1 {

	@Override
	public void m1(int id) {
		
		super.m1(id);
	}

	@Override
	public int carprice() {
		
		return super.carprice();
	}

	@Override
	public String laptop() {
		
		return super.laptop();
	}
	public static void main(String[] args) {
		Overridep k=new Overridep();
		
		
		k.m1(1);
		System.out.println(k.id);
		System.out.println(k.carprice());
		System.out.println(k.laptop());
		
	}

	
}