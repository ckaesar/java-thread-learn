package com.kaesar.threads.test;

/**
 * 实现方法内部声明一个变量时，是不存在“非线程安全”问题的
 * @author chengkai
 *
 */
public class HasSelfPrivateNum {

	public void addI(String username) {
		try {
			int num = 0;
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
