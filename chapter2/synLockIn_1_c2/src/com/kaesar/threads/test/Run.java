package com.kaesar.threads.test;

/**
 * synchronized锁重入：关键字synchronized拥有锁重入的功能，也就是在使用synchronized时，当一个线程得到一个对象锁后，再次请求此对象锁时是可以再次得到该对象的锁的。
 * 这也证明在一个synchronized方法/块的内部调用本类的其他synchronized方法/块时，是永远可以得到锁的。
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}
}
