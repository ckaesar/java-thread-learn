package com.kaesar.threads.test;

/**
 * 消费者
 * @author chengkai
 *
 */
public class C {

	private String lock;
	
	public C(String lock) {
		super();
		this.lock = lock;
	}
	
	public void getValue() {
		try {
			synchronized (lock) {
				while(ValueObject.value.equals("")) {
					System.out.println("消费者  " + Thread.currentThread().getName() + " WAITING了---");
					lock.wait();
				}
				System.out.println("消费者 " + Thread.currentThread().getName() + " RUNNING了");
				ValueObject.value = "";
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
