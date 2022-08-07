package com.summary.java.base.proxy;

public class RealSubject2 implements Subject {

	@Override
	public void doSomething() {
		System.out.println("RealSubject2 call doSomething()");
	}

}
