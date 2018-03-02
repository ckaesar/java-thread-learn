package com.kaesar.threads.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.text.ParseException;


/**
 * 执行任务的时间晚于当前时间：在未来执行的效果
 * 如果运行时间早于当前时间，则立即执行task任务
 * 运行程序发现：任务虽然执行完了，但进程还未销毁
 * @author chengkai
 *
 */
public class Run1 {

	private static Timer timer = new Timer();
	
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
			String dateString = "2018-03-02 14:46:00";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间：" + dateRef.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
			timer.schedule(task, dateRef);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
