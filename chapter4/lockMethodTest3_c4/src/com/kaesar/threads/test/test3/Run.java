package com.kaesar.threads.test.test3;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service(true);
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				service.serviceMethod();
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
