package com.kaesar.threads.test;

/**
 * 运行结果抛异常：java.lang.IllegalMonitorStateException
 * 原因是没有“对象监视器”，也就是没有同步加锁
 * @author chengkai
 *
 */
public class Test1 {

	public static void main(String[] args) {
		try {
			String newString = new String("");
			newString.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
