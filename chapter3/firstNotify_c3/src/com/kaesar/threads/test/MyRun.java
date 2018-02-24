package com.kaesar.threads.test;

public class MyRun {

	private String lock = new String("");
	
	private Runnable runnableA = new Runnable() {
		
		@Override
		public void run() {
			try {
				synchronized (lock) {
					System.out.println("begin wait");
					lock.wait();
					System.out.println("end wait");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
	
	private Runnable runnableB = new Runnable() {
		
		@Override
		public void run() {
			synchronized (lock) {
				System.out.println("begin notify");
				lock.notify();
				System.out.println("end notify");
			}
		}
	};
	
	public static void main(String[] args) {
		MyRun run = new MyRun();
		Thread a = new Thread(run.runnableA);
		a.start();
		Thread b = new Thread(run.runnableB);
		b.start();
	}
}
