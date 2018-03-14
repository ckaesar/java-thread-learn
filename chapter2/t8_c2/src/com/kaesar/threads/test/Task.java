package com.kaesar.threads.test;

/**
 * 验证同步synchronized(this)代码块是锁定当前对象的
 * @author chengkai
 *
 */
public class Task {
	
	synchronized public void otherMethod() { //验证同步synchronized(this)代码块是锁定当前对象的
//	public void otherMethod() {  //把上面一行注释掉，该行注释解除，测试一下
		System.out.println("----------run--otherMethod");
	}
	
	public void doLongTimeTask() {
		synchronized(this) {
			for(int i = 0; i < 10000; i++) {
				System.out.println("synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i+1));
			}
		}
	}
}
