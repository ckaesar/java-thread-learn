package com.kaesar.threads.test;

/**
 * 修改main方法中的代码顺序，wait方法永远不会被通知
 * @author chengkai
 *
 */
public class MyRun1 {

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
	
	public static void main(String[] args) throws InterruptedException {
		MyRun1 run = new MyRun1();
		Thread b = new Thread(run.runnableB);
		b.start();
		Thread.sleep(100);
		Thread a = new Thread(run.runnableA);
		a.start();
	}
}
