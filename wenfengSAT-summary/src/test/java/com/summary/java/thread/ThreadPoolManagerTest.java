package com.summary.java.thread;

public class ThreadPoolManagerTest {

	public static void main(String[] args) {
		ThreadPoolManager testPool = ThreadPoolManager.newInstance();
		testPool.addExecuteTask(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.err.println("test");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
					}
				}
			}
		});
		testPool.shutdown();
	}
}
