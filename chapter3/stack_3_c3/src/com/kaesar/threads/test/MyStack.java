package com.kaesar.threads.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 一生产者与一消费者：操作栈
 * @author chengkai
 *
 */
public class MyStack {

	private List list = new ArrayList();
	
	synchronized public void push() {
		try {
			while(list.size() == 1) {
				this.wait();
			}
			list.add("anyString=" + Math.random());
			this.notifyAll();
			System.out.println("push=" + list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized public String pop() {
		String returnValue = "";
		try {
			while(list.size() == 0) {
				System.out.println("pop操作中的：" + Thread.currentThread().getName() + " 线程呈wait状态"); 
				this.wait();
			}
			returnValue = "" + list.get(0);
			list.remove(0);
			this.notifyAll();
			System.out.println("pop=" + list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return returnValue;
	}
}
