package org.javaturk.jp.ch18;

class StaticAccess {
	static int i = 10;
	int j = 100;
	boolean b;
	
	public static void main(String args[]) {
//		System.out.println(this.j);
		System.out.println("StaticAccess.i: " + i);
		System.out.println("StaticAccess.i: " + StaticAccess.i);
		
		StaticAccess.increaseI(19);

		System.out.println("StaticAccess.i: " + StaticAccess.i);

		increaseI(29);
//		increaseJ(21); // Can't make a call to an instance method
//		System.out.println("Instance's j: " + j);
//		System.out.println("Instance's j: " + this.j);
//		System.out.println("b: " + b);
	}

	 static void increaseI(int i) {
//		this.i = 10; // i is not part of an object
//		this.j = 20; // j is not part of an object
		StaticAccess.i = i;
		i++;
//		StaticAccess.i++;
		System.out.println("Local i: " + i);
		System.out.println("StaticAccess's i: " + StaticAccess.i);
		aMethod();
//		increaseJ(); // Can't make a call to a instance method
	}
	
	static void aMethod() {
		System.out.println("in aMethod()");
	}
	
	void increaseJ(int j) {
		this.j = j;
		j++;
		this.j++;
		System.out.println("local j: " + j);
		System.out.println("Instance's j: " + this.j);
		System.out.println("b: " + b);
		aMethod();  // Can make a call to a static method
	}
}