package org.javaturk.jp.ch23.memberAccess.p;

public class ClassP {
	public int x = 10;
	int y = 20;
	protected int w = 30;
	private int z = 40;

	public void publicMethod() {
		System.out.println(z);
		privateMethod();
	}

	void defaultMethod() {
		privateMethod();
	}

	protected void protectedMethod() {
		privateMethod();
	}

	private void privateMethod() {
		System.out.println(z);
	}
}
