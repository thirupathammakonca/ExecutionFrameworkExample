package com.thiruacademy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExFramework {

	public static void main(String[] args) {
		//ExecutorService executorService = Executors.newSingleThreadExecutor();
		//ExecutorService executorService = Executors.newFixedThreadPool(3);
		ExecutorService executorService = Executors.newScheduledThreadPool(2);
		for(int i=0; i< 3; i++) {
			//executorService.execute(new MyRunnable("Thread "+i));
			executorService.submit(new MyRunnable("Thread "+i));
		}
		
		executorService.shutdown();
		System.out.println("All Thread executions Completed");

	}

}
