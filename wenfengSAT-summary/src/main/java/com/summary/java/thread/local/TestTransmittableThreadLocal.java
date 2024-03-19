package com.summary.java.thread.local;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.alibaba.ttl.TtlRunnable;

public class TestTransmittableThreadLocal {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		TestParamLocal1 testParamLocal1 = TestContextLocal.get().getLocal1();
		testParamLocal1.setParam1("testParamLocal1");
		testParamLocal1.setParam2(666);

		TestParamLocal2 testParamLocal2 = TestContextLocal.get().getLocal2();

		// 在线程池中执行任务
		executorService.execute(TtlRunnable.get(() -> {

			testParamLocal2.setParam1("testParamLocal2");
			testParamLocal2.setParam2(888);
			System.out.println("testParamLocal1.param1:" + TestContextLocal.get().getLocal1().getParam1());
			System.out.println("testParamLocal1.param2:" + TestContextLocal.get().getLocal1().getParam2());

		}));

		System.out.println("testParamLocal2.param1:" + TestContextLocal.get().getLocal2().getParam1());
		System.out.println("testParamLocal2.param2:" + TestContextLocal.get().getLocal2().getParam2());
		// 等待任务执行完成
		executorService.shutdown();
		System.out.println("testParamLocal2.param1:" + TestContextLocal.get().getLocal2().getParam1());
		System.out.println("testParamLocal2.param2:" + TestContextLocal.get().getLocal2().getParam2());
		executorService.awaitTermination(1, TimeUnit.SECONDS);
	}
}
