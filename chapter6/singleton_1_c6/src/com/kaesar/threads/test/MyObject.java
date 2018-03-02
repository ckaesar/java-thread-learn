package com.kaesar.threads.test;

/**
 * 单例模式-延迟加载/“懒汉模式”：延迟加载就是在调用get()方法时实例才被创建，常见的实现办法是在get()方法中进行new实例化。
 * @author chengkai
 *
 */
public class MyObject {

	private static MyObject myObject;
	
	private MyObject() {
		
	}
	
	public static MyObject getInstance() {
		//延迟加载
		if(myObject != null) {

		} else {
			myObject = new MyObject();
		}
		return myObject;
	}
}
