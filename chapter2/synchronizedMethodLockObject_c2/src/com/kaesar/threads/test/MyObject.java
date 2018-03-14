package com.kaesar.threads.test;

/**
 * synchronized方法与锁对象
 * 调用关键字synchronized声明的方法一定是排队进行的。另外需要牢记“共享”两个字，只有共享资源的读写访问才需要同步化，如果不是共享资源，那么根本没有必要进行同步
 * @author chengkai
 *
 */
public class MyObject {

	synchronized public void methodA() { //添加synchronized关键字，测试锁对象
//	public void methodA() {
		try {
			System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
