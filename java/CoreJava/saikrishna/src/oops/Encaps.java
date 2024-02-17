package oops;

public class Encaps {
	private long accNum=6868932893l;
	private String holdername="batman";
	private String ifsccode="sbhyn435";
	private int balance=52456;
	
	
	
	
	


	public long getAccNum() {
		return accNum;
	}


	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}


	public String getHoldername() {
		return holdername;
	}


	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}


	public String getIfsccode() {
		return ifsccode;
	}


	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public static void main(String[] args) {
		Encaps typ=new Encaps();
		System.out.println(typ.balance);
		System.out.println(typ.accNum);
		System.out.println(typ.getBalance());
	}
	
	
	
	

}
