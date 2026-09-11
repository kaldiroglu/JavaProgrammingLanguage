
package org.javaturk.jp.ch21.staticImport;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

import static org.javaturk.jp.ch21.staticImport.AClass.*;
// Instead of the line above, following lines import each of AClass's static members
//import static org.javaturk.jp.ch21.staticImport.AClass.A_CONSTANT;
//import static org.javaturk.jp.ch21.staticImport.AClass.aStaticVariable;
//import static org.javaturk.jp.ch21.staticImport.AClass.aStaticMethod;

public class StaticImport {

	public static void main(String[] args) {
		System.out.println(A_CONSTANT);
		System.out.println(aStaticVariable);
		aStaticMethod();
		
		System.out.println();
		
		System.out.println(Math.PI + " " + PI);
		System.out.println(Math.pow(2, 10) + " " + pow(2,10));
	}
}
