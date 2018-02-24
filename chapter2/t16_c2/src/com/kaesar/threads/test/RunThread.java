package com.kaesar.threads.test;

public class RunThread extends Thread {
	
//	private boolean isRunning = true;
	volatile private boolean isRunning = true;	//使用volatile关键字，主要作用就是当线程访问isRunning这个变量时，强制性的从公共堆栈中进行取值。

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	@Override
	public void run() {
		System.out.println("进入run了");
		while(isRunning == true) {
			
		}
		System.out.println("线程被停止了");
	}

}
