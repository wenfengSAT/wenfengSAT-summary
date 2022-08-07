package com.summary.java.base.singleton;

/**
 * 
 * @Description： 懒汉式，线程不安全
 * 是否 Lazy 
 * 初始化：是 
 * 是否多线程安全：否 
 * 实现难度：易
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。 这种方式
 * lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 * 
 * @author [ Wenfeng.Huang ] on [2019年12月13日上午10:24:02]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public class SingletonPatternDemo1 {
	
	private static SingletonPatternDemo1 instance;

	private SingletonPatternDemo1() {
	}

	public static SingletonPatternDemo1 getInstance() {
		if (instance == null) {
			instance = new SingletonPatternDemo1();
		}
		return instance;
	}
}
