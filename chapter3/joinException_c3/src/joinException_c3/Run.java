package joinException_c3;

/**
 * 运行结果可知：方法join()与interrupt()方法如果彼此遇到，则会出现异常。但进程按钮还呈“红色”，原因是线程ThreadA还在继续运行，线程ThreadA并未出现异常，是正常执行的状态。
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			b.start();
			Thread.sleep(500);
			
			ThreadC c = new ThreadC(b);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
