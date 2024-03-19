package com.summary.java.thread.local;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.alibaba.ttl.threadpool.TtlExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TtlExecutorsDemo {

	/**
	 * 【推荐使用】
	 * 
	 * TtlExecutors是阿里巴巴开源的一个工具类，用于在使用线程池的情况下使用TransmittableThreadLocal。
	 * 具体来说，TtlExecutors提供了一些工具方法，可以方便地将线程池和TransmittableThreadLocal结合起来使用。
	 */
	private static TransmittableThreadLocal<String> threadLocal = new TransmittableThreadLocal<>();

	public static void main(String[] args) {
		// 创建一个固定大小的线程池
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		// 在主线程中设置TransmittableThreadLocal的值
		threadLocal.set("Hello, World!");

		// 使用TtlExecutors包装线程池
		ExecutorService ttlExecutorService = TtlExecutors.getTtlExecutorService(executorService);

		// 提交任务到线程池中
		ttlExecutorService.submit(() -> {
			String value = threadLocal.get();
			System.out.println("Task is running in thread: " + Thread.currentThread().getName()
					+ ", TransmittableThreadLocal value: " + value);
		});

		// 关闭线程池
		ttlExecutorService.shutdown();
	}
}
