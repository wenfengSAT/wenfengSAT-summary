package com.summary.java.base.proxy;

public class SubjectProxy implements Subject {
	
	Subject subimpl = new RealSubject();

	@Override
	public void doSomething() {
		System.out.println("我们先做点什么");
        subimpl.doSomething();
        System.out.println("我们再做点什么");
	}

}
