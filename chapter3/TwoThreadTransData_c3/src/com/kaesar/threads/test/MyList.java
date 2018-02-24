package com.kaesar.threads.test;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private List list = new ArrayList();
	
	public void add() {
		list.add("凯撒");
	}
	
	public int size() {
		return list.size();
	}
}
