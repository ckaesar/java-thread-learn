package com.kaesar.threads.test;

public class BLogin extends Thread {

	@Override
	public void run() {
		LoginServlet.doPost("b", "bb");
	}
}
