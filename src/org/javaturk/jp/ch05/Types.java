package org.javaturk.jp.ch05;

public class Types {

	public static void main(String[] args) {
		// Error
		//i = 5; // i must have a type
		
		int i = 5; // i must have a type that is suitable for value 5
		//i = true;   // i can't change its type
		//i = "Java"; // i can't change its type
		i++;
		System.out.println(i);
	}
}
