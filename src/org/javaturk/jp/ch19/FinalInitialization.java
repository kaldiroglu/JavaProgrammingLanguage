package org.javaturk.jp.ch19;

public class FinalInitialization {

	public static void main(String[] args) {
	}
}

class A {

	final int i;
	String name;
	
	static final int j;
	
	{
		i = 11;
	}
	
	static
	{
		j = 17;
	}

	A() {
		//i = 5;
		this(5);
	}

	A(int i) {
//		this.i = i;
//		j = 17;
	}

	A(String name) {
		this.name = name;
//		i = 12;
//		j = 17;
	}
}
