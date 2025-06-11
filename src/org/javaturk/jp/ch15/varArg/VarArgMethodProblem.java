package org.javaturk.jp.ch15.varArg;

public class VarArgMethodProblem {
    public static void main(String[] args) {
        int a[] = {2, 3};
//		f(1, a); // Problem for f(int ... args)
//		f(1, 2, a); // Problem for f(int ... args)
        f(new int[]{1, 2, 3});

        f(a);

        f(4);

        f(4, 5);

		f(4, 5, 6);

        int[] array = {1, 2,3};
        wrongAverage3(array, 1,2,3);
    }

//    public static void wrongAverage1(int... array, int y, boolean b,) {
//
//    }

//	public static void wrongAverage2(int... intArray, boolean... booleanArray) {
//
//	}

    public static void wrongAverage3(int[] intArray1, int ... intArray2) {
        System.out.println("wrongAverage3");
	}

    public static void f(int ... args) {
        System.out.println("f(int ... args)");
    }

//	Var-arg must be last parameter
//	public static void f(int ... args, int k) {
//		System.out.println("f(int ... args, int k)");
//	}

// If following is un-commented then following calls can't resolve the right method: f(4) and f(4, 5)
//	public static void f(int i, int ... args) {
//		System.out.println("f(int i, int ... args)");
//	}

//	The same thing happens here for f(4, 5)
//	public static void f(int i, int j, int... args) {
//		System.out.println("f(int i, int j, int... args)");
//	}
}
