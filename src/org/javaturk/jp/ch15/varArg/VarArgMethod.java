package org.javaturk.jp.ch15.varArg;

class VarArgMethod {

	// main as var arg method
	public static void main(String... args) {

		calculateAverage(4, 3);
		calculateAverage(4, 3, 8);

		int a[] = { 15, 25, 35, 45, 55, 65 };
		calculateAverageWithArray(a);

		int b[] = { 15, 25, 35, 45, 55, 65, 75, 86 };
		calculateAverageWithArray(b);

		average(); // Calls with no argument, NaN if the length is not checked!
		average(1);
		average(1, 2, 3, 4);
		average(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		average(0xAB);
		average(b);

		anotherAverage(2, true, 3, 4, 5);
	}

	// Method with two arguments
	 static void calculateAverage(int x, int y) {
		System.out.println("Average: " + (double) (x + y) / 2);
	}

	// Method with three arguments and goes on!
	 static void calculateAverage(int x, int y, int z) {
		System.out.println("Average: " + (double) (x + y + z) / 3);
	}

	// Method with array arguments. But it needs to be called by providing an array
	 static void calculateAverageWithArray(int[] array) {
		if(array.length == 0)
			System.out.println("Average: " + 0);
		int sum = 0;
		int i = 0;
		for (int x : array) {
			sum += x;
			i++;
		}
		System.out.println("Average: " + (double) sum / i);
	}

	// That's the solutions.
	 static void average(int ... array) {
		if(array.length == 0)
			System.out.println("Average: " + 0);
		int sum = 0;
		int i = 0;
		for (int x : array) {
			sum += x;
			i++;
		}

		System.out.println("Average: " + (double) sum / i);
	}

	 static void anotherAverage(int y, boolean b, int... array) {
		if(array.length == 0)
			System.out.println("Average: " + 0);
		int sum = 0;
		int i = 0;
		if (b)
			for (int x : array) {
				sum += x;
				i++;
			}
		System.out.println("Average: " + (double) sum / i);
		System.out.println("y: " + y);
	}
}
