package com.kaesar.threads.test;

public class Run {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		P p = new P(myStack);
		C c1 = new C(myStack);
		C c2 = new C(myStack);
		C c3 = new C(myStack);
		C c4 = new C(myStack);
		C c5 = new C(myStack);
		P_Thread pThread = new P_Thread(p);
		C_Thread cThread1 = new C_Thread(c1);
		C_Thread cThread2 = new C_Thread(c2);
		C_Thread cThread3 = new C_Thread(c3);
		C_Thread cThread4 = new C_Thread(c4);
		C_Thread cThread5 = new C_Thread(c5);
		pThread.start();
		cThread1.start();
		cThread2.start();
		cThread3.start();
		cThread4.start();
		cThread5.start();
	}
}
