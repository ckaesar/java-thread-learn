package com.kaesar.threads.test;

public class BackupB extends Thread {

	private DBTools dbTools;
	
	public BackupB(DBTools dbTools) {
		super();
		this.dbTools = dbTools;
	}
	
	@Override
	public void run() {
		dbTools.backupB();
	}
}
