
package org.javaturk.jp.ch21.staticImport;

//import static java.lang.Math.*;

public class StaticImportCaution {

	public static void main(String[] args) {
		double PI = 5.29;

		System.out.println(Math.PI + " " + PI);
		System.out.println(Math.pow(2, 10) + " " + pow(2,10));
	}

	/*
		Be careful with this!
	 */
	static double pow(double a, double b){
		return 1.0;
	}
}
