package com.kaesar.threads.test;

/**
 * 脏读：在赋值时进行了同步，但是在取值时有可能出现一些意想不到的意外，这种情况就是脏读（dirtyRead）。
 * 发生脏读的情况是在读取实例变量时，此值已经被其他线程更改过了。
 * 脏读一定会出现操作实例变量的情况下，这就是不同线程“争抢”实例变量的结果。
 * @author chengkai
 *
 */
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
