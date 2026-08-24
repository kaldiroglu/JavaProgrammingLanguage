package org.javaturk.jp.ch15.overloading;

class OverloadingOverReturnType {

    static void calculateExp(int base, int exp) {
        System.out.println("calculateExp(int base, int exp)");
        double result = Math.pow(base, exp);
        System.out.println(base + " ^ " + exp + " = " + result);
    }

    static void calculateExp(double base, int exp) {
        System.out.println("calculateExp(double base, int exp)");
        double result = Math.pow(base, exp);
        System.out.println(base + " ^ " + exp + " = " + result);
    }

//  Can't overload over return type!	
//	 double calculateExp(double base, int exp){
//		System.out.println("calculateExp(double base, int exp)");
//		double result = Math.pow(base, exp);
//		System.out.println(base + " ^ " + exp + " = " + result);
//        return result;
//	}

    public static void main(String[] args) {
        calculateExp(5, 7);
        System.out.println();
        calculateExp(5d, 7);
    }

}
