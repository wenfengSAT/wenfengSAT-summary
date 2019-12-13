package com.summary.java.base.singleton;

import java.util.Objects;

/**
 * 
 * @Description： 双检锁/双重校验锁（DCL，即 double-checked locking）
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2019年12月13日上午10:28:51]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public class SingletonPatternDemo {

	volatile private static SingletonPatternDemo instance;

	public SingletonPatternDemo() {
	}

	public static SingletonPatternDemo getInstance() {
		if (Objects.isNull(instance)) {
			synchronized (SingletonPatternDemo.class) {
				if (Objects.isNull(instance)) {
					instance = new SingletonPatternDemo();
				}
			}
		}
		return instance;
	}
}
