package com.kaesar.threads.test;

public class Run {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		P p = new P(myStack);
		C c = new C(myStack);
		P_Thread pThread = new P_Thread(p);
		C_Thread cThread = new C_Thread(c);
		pThread.start();
		cThread.start();
	}
}
