package com.kaesar.threads.test.test2;

/**
 * 验证当其他线程执行x对象中synchronized同步方法时呈现同步效果
 * @author chengkai
 *
 */
public class Run {
	
	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		MyObject object = new MyObject();
		
		ThreadA threadA = new ThreadA(service, object);
		threadA.setName("a");
		threadA.start();
		Thread.sleep(100);
		
		ThreadB threadB = new ThreadB(object);
		threadB.setName("b");
		threadB.start();
	}
}
