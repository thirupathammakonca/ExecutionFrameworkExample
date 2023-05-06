package com.thiruacademy;

public class MyRunnable implements Runnable {
	
	final String task;
	public MyRunnable(String task) {
		this.task = task;
	}

	@Override
	public void run() {
		for(int i= 0; i < 4; i++) {
			System.out.println("Executing "+ task + " from "+Thread.currentThread().getName());
		}

	}

}
