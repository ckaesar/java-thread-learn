package com.kaesar.threads.test;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 静态内置类可以达到线程安全问题，但是如果遇到序列化对象时，使用默认的方式运行得到的结果还是多例的
 * 
 * 
 * 
 * @author chengkai
 *
 */
public class MyObject implements Serializable {

	private static final long serialVersionUID = 888L;

	//内部类方式
	private static class MyObjectHandler {
		private static MyObject myObject = new MyObject();
	}
	
	private MyObject() {
		
	}
	
	public static MyObject getInstance() {
		return MyObjectHandler.myObject;
	}
	
	protected Object readResolve() throws ObjectStreamException {
		System.out.println("调用了readResolve方法！");
		return MyObjectHandler.myObject;
	}
}
