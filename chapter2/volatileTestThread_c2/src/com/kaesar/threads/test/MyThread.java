package com.kaesar.threads.test;

/**
 * 验证volatile虽然增加了实例变量在多个线程之间的可见性，但是它并不具备同步性，那么也就不具备原子性
 * 
 * 关键字volatile主要使用的场合是在多个线程中可以感知实例变量被更改了，并且可以获得最新的值使用，也
 * 就是用多线程读取共享变量时可以获取最新值使用。
 * 
 * 关键字volatile提示线程每次从共享内存中读取变量，而不是从私有内存中读取，这样就保证了同步数据的可见性。
 * 
 * @author chengkai
 *
 */
public class MyThread extends Thread {
	
	volatile public static int count;
	
	//修改：添加synchronized关键字
	//注意：一定要添加static关键字，这样synchronized与static锁的内容就是MyThread.class类了，也就达到同步的效果了
	synchronized private static void addCount() {
//	private static void addCount() {
		for(int i = 0; i < 100; i++) {
			count++;
		}
		System.out.println("count=" + count);
	}
	
	@Override
	public void run() {
		addCount();
	}

}
