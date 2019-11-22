package com.summary.java.base.cloneable;

public class Cloneable1 {

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
	public String toString() {
		return "hashcode:" + this.hashCode() + ",testStr" + this.testStr + ",testInt:" + this.testInt;
	}

}
