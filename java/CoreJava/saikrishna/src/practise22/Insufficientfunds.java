package practise22;

public class Insufficientfunds extends RuntimeException {
  public Insufficientfunds(String msg) {
	  System.out.println(msg);
  }
}
