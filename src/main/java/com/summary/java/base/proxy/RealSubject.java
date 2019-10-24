package com.summary.java.base.proxy;

public class RealSubject implements Subject {

	@Override
	public void doSomething() {
		System.out.println("RealSubject call doSomething()");
	}

}
