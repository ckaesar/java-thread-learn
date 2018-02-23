package com.kaesar.threads.test.test1;

/**
 * 当多个线程同时执行synchronized(x){}同步代码块时呈现同步效果，使用同一个“对象监视器”
 * @author chengkai
 *
 */
public class Run1_1 {

	public static void main(String[] args) {
		Service service = new Service();
		MyObject object = new MyObject();
		
		ThreadA threadA = new ThreadA(service, object);
		threadA.setName("A");
		threadA.start();
		
		ThreadB threadB = new ThreadB(service, object);
		threadB.setName("B");
		threadB.start();
	}
}
