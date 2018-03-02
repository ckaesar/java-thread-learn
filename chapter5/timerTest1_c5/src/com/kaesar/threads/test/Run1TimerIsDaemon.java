package com.kaesar.threads.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 将创建的Timer改成守护线程
 * 运行程序发现：程序运行后迅速结束当前的线程，并且TimerTask中的任务不再被运行，因为进程已经结束了
 * @author chengkai
 *
 */
public class Run1TimerIsDaemon {

	private static Timer timer = new Timer(true);
	
	static public class MyTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("运行了！时间为：" + new Date()); 
		}
		
	}
	
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2018-03-02 15:23:30";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间：" + dateRef.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
			timer.schedule(task, dateRef);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
