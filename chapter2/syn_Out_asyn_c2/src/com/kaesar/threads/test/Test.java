package com.kaesar.threads.test;

public class Test {

	public static void main(String[] args) {
		MyList myList = new MyList();
		MyThreadA threadA = new MyThreadA(myList);
		threadA.setName("A");
		threadA.start();
		MyThreadB threadB = new MyThreadB(myList);
		threadB.setName("B");
		threadB.start();
	}
}
