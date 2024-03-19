package com.summary.java.thread.local;

import com.alibaba.ttl.TransmittableThreadLocal;

public class TransmittableThreadLocalDemo {

	/**
	 * TransmittableThreadLocal是ThreadLocal的一个增强版，因此在使用时需要注意一些细节。
	 * 例如，TransmittableThreadLocal的使用方式与ThreadLocal略有不同，
	 * 需要使用TtlRunnable和TtlCallable等类来包装Runnable和Callable。
	 * 此外，TransmittableThreadLocal也需要进行垃圾回收，否则可能会导致内存泄漏
	 */
	private static TransmittableThreadLocal<String> threadLocal = new TransmittableThreadLocal<>();

	public static void main(String[] args) {
		// 在主线程中设置TransmittableThreadLocal的值
		threadLocal.set("Hello, World!");

		// 在新线程中获取TransmittableThreadLocal的值
		Thread thread = new Thread(() -> {
			String value = threadLocal.get();
			System.out.println("TransmittableThreadLocal value in new thread: " + value);
		});
		thread.start();
	}
}
