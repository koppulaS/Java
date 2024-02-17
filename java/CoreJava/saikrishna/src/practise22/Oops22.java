package practise22;

public class Oops22 {
   private String accountname="batman123";
    private String ifsccode="sbhyoo7869";
    private long accountnumber=62447356789l;
      private long AccountBalance=87658;
      
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	private double getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	private long getAccountBalance() {
		return AccountBalance;
	}
	private void setAccountBalance(long accountBalance) {
		AccountBalance = accountBalance;
	}
      
      
      public static void main(String[] args) {
		Oops22 k=new Oops22();
		System.out.println( k.accountname);
	}
}
