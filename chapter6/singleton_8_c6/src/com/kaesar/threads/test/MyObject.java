package com.kaesar.threads.test;

/**
 * 单例模式-使用static代码块实现单例模式
 * 
 * @author chengkai
 *
 */
public class MyObject {

	private static MyObject instance = null;
	
	private MyObject() {
		
	}
	
	static {
		instance = new MyObject();
	}
	
	public static MyObject getInstance() {
		return instance;
	}
}
