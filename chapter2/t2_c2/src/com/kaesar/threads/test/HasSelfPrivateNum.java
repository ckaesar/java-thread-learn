package com.kaesar.threads.test;

/**
 * 如果多个线程共同访问1个对象中的实例，则有可能出现“非线程安全”问题。
 * 在方法前面添加synchronized关键字，可以解决这个问题
 * @author chengkai
 *
 */
public class HasSelfPrivateNum {

	private int num = 0;
	
//	synchronized public void addI(String username) {  //添加synchronized保证线程安全
	public void addI(String username) {
		try {
			if(username.equals("a")) {
				num = 100;
				System.out.println("a set over!");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b set over!");
			}
			System.out.println(username + " num=" + num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
