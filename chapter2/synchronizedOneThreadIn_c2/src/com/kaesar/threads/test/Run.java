package com.kaesar.threads.test;

/**
 * 运行程序可知：虽然使用了synchronized同步代码块，但执行的效率还是没有提高，执行的效果还是同步运行的
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		ObjectService service = new ObjectService();
		ThreadA threadA = new ThreadA(service);
		threadA.setName("a");		
		threadA.start();
		ThreadB threadB = new ThreadB(service);
		threadB.setName("b");
		threadB.start();
	}
	
}
