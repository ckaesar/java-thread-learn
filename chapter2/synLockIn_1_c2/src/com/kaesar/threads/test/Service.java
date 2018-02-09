package com.kaesar.threads.test;

/**
 * 可重入锁：自己可以再次获得自己的内部锁。比如有1条线程获得了某个对象的锁，此时这个对象锁还没有释放，当其再次想要获取这个对象的锁的时候还是可以获取的，如果不可锁重入的话，就会造成死锁
 * 可重入锁也支持在父子类继承的环境中，见synLockIn_2_c2
 * @author chengkai
 *
 */
public class Service {
	
	synchronized public void service1() {
		System.out.println("service1");
		service2();
	}
	
	synchronized public void service2() {
		System.out.println("service2");
		service3();
	}
	
	synchronized public void service3() {
		System.out.println("service3");
	}
}
