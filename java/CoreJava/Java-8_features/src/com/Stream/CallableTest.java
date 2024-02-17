
package com.Stream;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest implements Callable<String>{

	@Override
	public String call() throws Exception {
		
		System.out.println("call method called .......");
		return "Success";
	}

public static void main(String[] args) throws InterruptedException, ExecutionException {
 ExecutorService ec=	Executors.newSingleThreadExecutor();
 Future<String> fut= ec.submit(new CallableTest());
 System.out.println(fut.get());
 ec.shutdown();
 
}
	
	
}
