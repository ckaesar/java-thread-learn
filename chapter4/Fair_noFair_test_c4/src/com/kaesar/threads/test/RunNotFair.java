package com.kaesar.threads.test;

/**
 * 非公平锁：非公平锁是一种获取锁的抢占机制，是随机获得锁的，和公平锁不一样的就是先来的不一定先得到锁，这个方式可能造成某些线程一直拿不到锁，结果也就是不公平的了
 * @author chengkai
 *
 */
public class RunNotFair {

	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service(false);
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("+线程" + Thread.currentThread().getName() + "运行了");
				service.serviceMethod();
			}
		};
		
		Thread[] threads = new Thread[10];
		for(int i = 0; i < 10; i++) {
			threads[i] = new Thread(runnable);
		}
		for(int i = 0; i < 10; i++) {
			threads[i].start();
		}
	}
}
