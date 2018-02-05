package com.kaesar.threads.test;

/**
 * 本类模拟成一个Servlet组件
 * @author chengkai
 */
public class LoginServlet {

	private static String usernameRef;
	
	private static String passworrdRef;
	
	synchronized public static void doPost(String username, String password) {
		try {
			usernameRef = username;
			if(username.equals("a")) {
				Thread.sleep(5000);
			}
			
			passworrdRef = password;
			System.out.println("username=" + usernameRef + " password=" + password);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
