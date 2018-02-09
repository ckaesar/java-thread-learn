package com.kaesar.threads.test;

public class PublicVar {

	public String username = "A";
	public String password = "AA";
	
	synchronized public void setValue(String username, String password) {
		try {
			this.username = username;
			Thread.sleep(5000);
			this.password = password;
			System.out.println("setValue method thread name=" + Thread.currentThread().getName() + " username=" + username + " password=" +password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized public void getValue() { //不加synchronized会出现脏读。 把这行注释掉，把下面的一行注释取消测试一下
//	public void getValue() {
		System.out.println("getValue method thread name=" + Thread.currentThread().getName() + " username=" + username + " password=" + password);
	}
}
