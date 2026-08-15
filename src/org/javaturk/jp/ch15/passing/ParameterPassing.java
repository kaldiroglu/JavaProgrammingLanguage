package org.javaturk.jp.ch15.passing;

class ParameterPassing {

	 void f(A aa) { // aa = a
		aa.i++;
	}

	 void f(int j) {  // j = i
		j++;
	}

	public static void main(String[] args) {
		ParameterPassing o = new ParameterPassing();
		
//		Passing a primitive
		int i = 5;
		System.out.println("i: " + i);
		o.f(i);
		System.out.println("i: " + i);
		
		System.out.println();
		
//		Passing a reference
		A a = new A();
		System.out.println("a.i: " + a.i);
		o.f(a);
		System.out.println("a.i: " + a.i);
	}
}

class A {
	int i = 5;
}
