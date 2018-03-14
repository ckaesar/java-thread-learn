package com.kaesar.threads.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 验证多个线程调用同一个方法时随机的
 * @author chengkai
 *
 */
public class MyList {

	private List list = new ArrayList();
	
	synchronized public void add(String username) {
		System.out.println("ThreadName=" + Thread.currentThread().getName() + "执行了add方法！");
		list.add(username);
		System.out.println("ThreadName=" + Thread.currentThread().getName() + "退出了add方法！");
	}

	synchronized public int getSize() {
		System.out.println("ThreadName=" + Thread.currentThread().getName() + "执行了getSize方法！");
		int sizeValue = list.size();
		System.out.println("ThreadName=" + Thread.currentThread().getName() + "退出了getSize方法！");
		return sizeValue;
	}
}
