package com.singleton;

public class Test implements Runnable {

	@Override
	public void run() {
		SingletonExample.getInstance();
	}
}
