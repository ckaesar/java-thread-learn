package com.kaesar.threads.test;

/**
 * 减法
 * @author chengkai
 *
 */
public class Subtract {

	private String lock;
	
	public Subtract(String lock) {
		super();
		this.lock = lock;
	}
	
	public void subtract() {
		try {
			synchronized (lock) {
				if(ValueObject.list.size() == 0) {
//				while(ValueObject.list.size() == 0) {   //将代码改成这一行的就可以解决这个抛异常的问题了
					System.out.println("wait begin ThreadName=" + Thread.currentThread().getName());
					lock.wait();
					System.out.println("wait end ThreadName=" + Thread.currentThread().getName());
				}
				ValueObject.list.remove(0);
				System.out.println("list size=" + ValueObject.list.size());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
