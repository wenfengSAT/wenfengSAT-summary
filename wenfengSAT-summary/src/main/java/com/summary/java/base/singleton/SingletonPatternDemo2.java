package com.summary.java.base.singleton;

/**
 * 
 * @Description： 懒汉式，线程安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：易
 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 * @author [ Wenfeng.Huang ] on [2019年12月13日上午10:26:05]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public class SingletonPatternDemo2 {

	private static SingletonPatternDemo2 instance;

	private SingletonPatternDemo2() {
	}

	public static synchronized SingletonPatternDemo2 getInstance() {
		if (instance == null) {
			instance = new SingletonPatternDemo2();
		}
		return instance;
	}
}
