package com.kaesar.threads.test;

public class ThreadB extends Thread {

	private int count = 0;

	public int getCount() {
		return count;
	}

	@Override
	public void run() {
		while(true) {
			count++;
		}
	}
}
