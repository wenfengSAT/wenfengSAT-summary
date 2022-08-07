package com.summary.java.base.cloneable;

public class Cloneable3 implements Cloneable {

	private String testStr;
	private int testInt;

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public int getTestInt() {
		return testInt;
	}

	public void setTestInt(int testInt) {
		this.testInt = testInt;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return (Cloneable3)super.clone();
	}

	@Override
	public String toString() {
		return "hashcode:" + this.hashCode() + ",testStr" + this.testStr + ",testInt:" + this.testInt;
	}

}
