package oops;



public class Overridep extends Overriding1 {

	@Override
	
	
	public void m1(int id  ) {
		System.out.println(id);	
		}
	@Override
		public int carprice() {
			return 500;
		}
	  
		
		
		
		@Override
	public String laptop() {
			return "predator";
		}
		
		
		public static void main(String[] args) {
			Overridep o=new Overridep();
			o.m1(o.id);
			System.out.println(o.carprice());
			System.out.println(o.laptop());
			
		}
}
