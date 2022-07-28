 package com.singleton;

 public class SingletonExample {
	private static final Object sync = new Object();

	public static int counter = 0;
	private static volatile SingletonExample instance = null;

	private SingletonExample() {
		counter++;
	}

	public static SingletonExample getInstance() {
		if (instance == null) {
			synchronized(sync) {
				if(instance == null)
			            instance = new SingletonExample();
			}
		}
		return instance;
	}
 }
