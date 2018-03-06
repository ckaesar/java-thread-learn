package com.kaesar.threads.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 解决类 SimpleDateFormat 在多线程环境下的异常：原理就是创建了多个SimpleDateFormat类的实例
 * @author chengkai
 *
 */
public class MyThread extends Thread {

	private SimpleDateFormat sdf;
	private String dateString;
	
	public MyThread(SimpleDateFormat sdf, String dateString) {
		super();
		this.sdf = sdf;
		this.dateString = dateString;
	}
	
	@Override
	public void run() {
		try {
			Date dateRef = DateTools.parse("yyyy-MM-dd", dateString);
			String newDateString = DateTools.format("yyyy-MM-dd", dateRef);
			if(!newDateString.equals(dateString)) {
				System.out.println("ThreadName=" + this.getName() + "报错了，日期字符串：" + dateString + " 转换成的日期为：" + newDateString);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
