package com.kaesar.threads.test;

/**
 * 消费者
 * @author chengkai
 *
 */
public class C {

	private MyStack myStack;
	
	public C(MyStack myStack) {
		super();
		this.myStack = myStack;
	}
	
	public void popService() {
		System.out.println("pop=" + myStack.pop());
	}
}
