package com.summary.java.base.proxy;

public class TestStaticProxy {

	public static void main(String[] args) {
		Subject sub = new SubjectProxy();
        sub.doSomething();
        ProxyHandler proxy = new ProxyHandler();
        //绑定该类实现的所有接口
        Subject sub1 = (Subject) proxy.bind(new RealSubject());
        sub1.doSomething();
        Subject sub2 = (Subject) proxy.bind(new RealSubject2());
        sub1.doSomething();
        sub2.doSomething();
	}
}
