package com.summary.java.base.cloneable;

public class Test implements Cloneable {

	private Cloneable1 clone1;
	private Cloneable2 clone2;
	private Cloneable3 clone3;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Test test = null;
		test = (Test) super.clone();
		test.clone2 = (Cloneable2) clone2.clone();
		return super.clone();
	}

	public Cloneable1 getClone1() {
		return clone1;
	}

	public void setClone1(Cloneable1 clone1) {
		this.clone1 = clone1;
	}

	public Cloneable2 getClone2() {
		return clone2;
	}

	public void setClone2(Cloneable2 clone2) {
		this.clone2 = clone2;
	}

	public Cloneable3 getClone3() {
		return clone3;
	}

	public void setClone3(Cloneable3 clone3) {
		this.clone3 = clone3;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Cloneable1 c1 = new Cloneable1();
		c1.setTestInt(1);
		c1.setTestStr("1");
		Cloneable2 c2 = new Cloneable2();
		c2.setTestInt(2);
		c2.setTestStr("2");
		Cloneable3 c3 = new Cloneable3();
		c3.setTestInt(3);
		c3.setTestStr("3");
		Test test = new Test();
		test.setClone1(c1);
		test.setClone2(c2);
		test.setClone3(c3);
		System.out.println(c1.toString());
		System.out.println("=============================");
		System.out.println(c2.toString());
		System.out.println(test.getClone2().toString());
		System.out.println(c2.clone().toString());
		System.out.println("=============================");
		System.out.println(c3.toString());
		System.out.println(test.getClone3().toString());
		System.out.println(c3.clone().toString());
	}

}
