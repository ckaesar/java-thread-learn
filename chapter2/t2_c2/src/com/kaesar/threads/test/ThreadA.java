package com.kaesar.threads.test;

public class ThreadA extends Thread {

	private HasSelfPrivateNum numref;
	
	public ThreadA(HasSelfPrivateNum numRef) {
		super();
		this.numref = numRef;
	}
	
	@Override
	public void run() {
		super.run();
		numref.addI("a");
	}
}
