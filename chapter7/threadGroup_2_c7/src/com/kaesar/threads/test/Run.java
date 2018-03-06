package com.kaesar.threads.test;

public class Run {

	public static void main(String[] args) {
		MythreadGroup group = new MythreadGroup("我的线程组");
		MyThread[] myThreads = new MyThread[10];
		for(int i = 0; i < 10; i++) {
			myThreads[i] = new MyThread(group, "线程" + (i+1), "1");
			myThreads[i].start();
		}
		MyThread newT = new MyThread(group, "报错线程", "a");
		newT.start();
	}
}
