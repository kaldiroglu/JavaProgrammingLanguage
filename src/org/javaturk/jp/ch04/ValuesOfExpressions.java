package org.javaturk.jp.ch04;

public class ValuesOfExpressions {

	public static void main(String[] args) {
//		int k = 2_147_483_648; // Max limit of an int number in Java is 2_147_483_647
		int k = 2_147_483_647 + 1; // Max limit of an int number in Java is 2_147_483_647
//		int k = 2_147_483_647; // Max limit of an int number in Java

		int i = k + 1; // -2147483648
		System.out.println(i);

		int j = increaseOne(k);
	}

	public static int increaseOne(int k){
		return k + 1;
	}
}
