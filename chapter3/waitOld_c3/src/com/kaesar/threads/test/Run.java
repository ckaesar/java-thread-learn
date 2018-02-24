package com.kaesar.threads.test;

/**
 * 运行结果会抛异常：因为有两个实现删除remove()操作的线程，它们在Thread.sleep(1000);之前都执行了wait()方法，呈等待状态，当加操作的线程在1秒之后被运行时，通知了所有呈等待状态的减操作的线程，那么第一个实现减操作的
 * 线程能正确的删除list中索引为0的数据，但第二个实现减操作的线程则出现索引溢出的异常，因为list中仅仅添加了一个数据，也只能删除一个数据，所以没有第二个数据可供删除。
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) throws InterruptedException {
		String lock = new String("");
		Add add = new Add(lock);
		Subtract subtract = new Subtract(lock);
		ThreadSubtract threadSubtract1 = new ThreadSubtract(subtract);
		threadSubtract1.setName("subtract1Thread");
		threadSubtract1.start();
		ThreadSubtract threadSubtract2 = new ThreadSubtract(subtract);
		threadSubtract2.setName("subtract2Thread");
		threadSubtract2.start();
		Thread.sleep(1000);
		ThreadAdd threadAdd = new ThreadAdd(add);
		threadAdd.setName("addThread");
		threadAdd.start();
	}
}
