package com.kaesar.threads.test;

/**
 * 锁非this对象：synchronized(非this)
 * 优点：如果一个类中有很多个synchronized方法，这是虽然能实现同步，但会受到阻塞，所以影响运行效率；但如果使用同步代码块
 * 锁非this对象，则synchronized(非this)代码块中的程序与同步方法是异步的，不与其他锁this对象争抢this锁，则可大大
 * 提高运行效率。
 * 
 * 使用synchronized(非this对象x)同步代码块格式进行同步操作时，如果不是同一个对象监视器，运行的结果就是异步调用了，就会
 * 交叉运行
 * 
 * @author chengkai
 *
 */
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
