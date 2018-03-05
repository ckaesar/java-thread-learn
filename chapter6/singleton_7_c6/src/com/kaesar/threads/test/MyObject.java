package com.kaesar.threads.test;

/**
 * 单例模式-使用静态内置类实现单例模式
 * @author chengkai
 *
 */
public class MyObject {

	//内部类方式
	private static class MyObjectHandler {
		private static MyObject myObject = new MyObject();
	}
	
	private MyObject() {
		
	}
	
	public static MyObject getInstance() {
		return MyObjectHandler.myObject;
	}
}
