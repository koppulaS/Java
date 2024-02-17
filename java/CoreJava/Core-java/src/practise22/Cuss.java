package practise22;

public class Cuss {
	int balance=1780;
	int minimumbalance=2789;
	
  public void reliancemart() {
	  if(balance>minimumbalance) {
		  System.out.println("welcome to store");
	  }else {
		  throw new Insufficientfunds("go to hell");
	  }
  }
  public static void main(String[] args) {
	  Cuss jj=new Cuss();
	  jj.reliancemart();
}
}
