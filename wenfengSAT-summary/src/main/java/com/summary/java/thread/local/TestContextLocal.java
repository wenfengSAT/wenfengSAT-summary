package com.summary.java.thread.local;

import java.util.Objects;

import com.alibaba.ttl.TransmittableThreadLocal;

import lombok.experimental.UtilityClass;

@UtilityClass
public class TestContextLocal {

	private static final ThreadLocal<TestContext> THREAD_LOCAL = new TransmittableThreadLocal<>();

	/**
	 * 获取
	 */
	public TestContext get() {
		TestContext testContext = THREAD_LOCAL.get();
		if (Objects.isNull(testContext)) {
			testContext = new TestContext();
			THREAD_LOCAL.set(testContext);
		}
		return testContext;
	}

	/**
	 * 清除
	 */
	public static void clear() {
		THREAD_LOCAL.remove();
	}
}
