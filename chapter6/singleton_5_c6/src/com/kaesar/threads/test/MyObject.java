package com.kaesar.threads.test;

/**
 * 单例模式-使用DCL双检查锁机制来实现多线程环境中的延迟加载单例设计模式
 * @author chengkai
 *
 */
public class MyObject {

	private volatile static MyObject myObject;
	
	private MyObject() {
		
	}
	
	//使用双检测机制来解决问题，既保证了不需要同步代码的异步执行性，又保证了单例的效果
	public static MyObject getInstance() {
		try {
			if(myObject != null) {
				
			} else {
				//模拟在创建对象之前做一些准备性的工作
				Thread.sleep(3000);
				synchronized (MyObject.class) {
					if(myObject == null) {
						myObject = new MyObject();
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
}
