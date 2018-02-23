package com.kaesar.threads.test;

public class Service {

	private String usernameParam;
	private String passwordParam;
//	private String anyString = new String(); //移动代码
	
	public void setUsernamePassword(String username, String password) {
		try {
			String anyString = new String(); //将上面这一行代码挪到这一行，测试一下。可知：使用synchronized(非this对象x)同步代码块进行同步操作时，对象监视器必须是同一个对象。如果不是同一个对象监视器，运行的结果就是异步调用了，就会交叉运行
			synchronized(anyString) {
				System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入代码块");
				usernameParam = username;
				Thread.sleep(3000);
				passwordParam = password;
				System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开同步快");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
