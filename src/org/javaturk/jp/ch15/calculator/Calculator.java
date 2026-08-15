package org.javaturk.jp.ch15.calculator;

class Calculator {
	String name;

	 String getName() {
		return name;
	}

	 void setName(String newName) {
		name = newName;
	}

	void whoAreYou(){
		System.out.println("I'm a Calculator, my name is " + name);
	}

	 int add(int first, int second) {
		return first + second;
	}

	 int subtract(int first, int second) {
		return first - second;
	}

	 int multiply(int first, int second) {
		int sonuc =  first * second;
		return sonuc;
	}
	
	 int multiplyByAdding(int first, int second) {
		int multiplication = 0;
		for(int i = 1; i <= second; i++)
			multiplication += first;
		System.out.println("Multiplication: " + multiplication);
		return multiplication;
	}

	 double divide(int first, int second) {
		String s;
		return (double)first / second;
	}
}