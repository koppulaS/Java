package com.Stream;

public class RunnableTest implements  Runnable {

	@Override
	public void run() {
		System.out.println("runnable thread......");
	}
	public static void main(String[] args) {
		RunnableTest rt = new RunnableTest();
		Thread t = new Thread(rt);
		t.start();
		
	}

}
