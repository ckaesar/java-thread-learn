package com.kaesar.threads.test;

/**
 * 运行代码可知：会抛异常java.lang.IllegalMonitorStateException，解决的办法就是必须在condition.await()方法调用之前调用lock.lock()代码获得同步监视器
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.start();
	}
}
