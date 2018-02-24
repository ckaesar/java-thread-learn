package com.kaesar.threads.test;

/**
 * 会出现假死的问题
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) throws InterruptedException {
		String lock = new String("");
		P p = new P(lock);
		C r = new C(lock);
		ThreadP[] threadPs = new ThreadP[2];
		ThreadC[] threadCs = new ThreadC[2];
		for(int i = 0; i < 2; i++) {
			threadPs[i] = new ThreadP(p);
			threadPs[i].setName("生产者" + (i+1));
			threadCs[i] = new ThreadC(r);
			threadCs[i].setName("消费者" + (i+1));
			threadPs[i].start();
			threadCs[i].start();
		}
		
		Thread.sleep(5000);
		Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);
		for(int i = 0; i < threadArray.length; i++) {
			System.out.println(threadArray[i].getName() + " " + threadArray[i].getState());
		}
	}
}
