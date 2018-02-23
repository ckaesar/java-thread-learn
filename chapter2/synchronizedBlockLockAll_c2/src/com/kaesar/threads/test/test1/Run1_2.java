package com.kaesar.threads.test.test1;

/**
 * 当多个线程同时执行synchronized(x){}同步代码块时呈现同步效果，使用不同的“对象监视器”
 * @author chengkai
 *
 */
public class Run1_2 {

	public static void main(String[] args) {
		Service service = new Service();
		MyObject object1 = new MyObject();
		MyObject object2 = new MyObject();
		
		ThreadA threadA = new ThreadA(service, object1);
		threadA.setName("a");
		threadA.start();
		
		ThreadB threadB = new ThreadB(service, object2);
		threadB.setName("b");
		threadB.start();
	}
}
