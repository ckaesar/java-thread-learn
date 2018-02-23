package com.kaesar.threads.test;

/**
 * 运行可知：只要对象不变，就是同步效果
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			UserInfo userInfo = new UserInfo();
			ThreadA threadA = new ThreadA(service, userInfo);
			threadA.setName("A");
			threadA.start();
			Thread.sleep(50);
			ThreadB threadB = new ThreadB(service, userInfo);
			threadB.setName("B");
			threadB.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
