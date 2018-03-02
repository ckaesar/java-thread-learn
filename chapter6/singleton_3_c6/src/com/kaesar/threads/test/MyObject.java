package com.kaesar.threads.test;

/**
 * 单例模式-延迟加载/“懒汉模式”：多线程问题解决方案
 * 
 * 1.声明synchronized关键字
 * 
 * @author chengkai
 *
 */
public class MyObject {

	private static MyObject myObject;
	
	private MyObject() {
		
	}
	
	//设置同步方法效率太低了，整个方法被上锁了
	synchronized public static MyObject getInstance() {
		try {
			if(myObject != null) {
				
			} else {
				//模拟在创建对象之前做一些准备性的工作
				Thread.sleep(3000);
				myObject = new MyObject();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
}
