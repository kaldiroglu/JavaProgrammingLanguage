package org.javaturk.jp.ch19;

class Weird {
	static int a = 10;

	static {
		b = a;
	}

	static int b = 5;
	
	static int c = 100;

	static {
		d = c;
	}

	static int d = 50;

	public static void main(String[] args) {
		System.out.println("a: " + a + " b: " + b);
		System.out.println("c: " + c + " d: " + d);
	}
}
