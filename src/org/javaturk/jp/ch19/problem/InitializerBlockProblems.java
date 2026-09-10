package org.javaturk.jp.ch19.problem;

class InitializerBlockProblems {

	static {
//		System.out.println(j);
//		i = j + 2; 	// Error! Reading j before declaring it!
		j = 10; // That's OK.
//		System.out.println(j);  // Error! Illegal forward reference, reading j before declaring it!
//		i = j + 2;	// Error! Illegal forward reference, reading j before declaring it!
	}

	static {
//		k = k+1; // Error! Illegal forward reference, reading k before declaring it!
//		k++;     // Error! Illegal forward reference, reading k before declaring it!
	}
	static int i, j = 5, k;

	static {
		j = 4;
	}

// 	 Can't do this
	 static boolean[] b;
	
	 static{
		 // Can't do that
//		 b = {true, true, false};
//		 return; // Error!
	 }
	
	int t = 10;
	
	static {
//		f = t * Math.random(); // Error! Can't make static reference
	}

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(new InitializerBlockProblems().t);
	}
}
