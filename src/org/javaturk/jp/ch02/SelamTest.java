package org.javaturk.jp.ch02;

public class SelamTest {

	public static void main(String[] args) {
		Selam object = new Selam();

		String answer = object.greet("Ayse");
		System.out.println(answer);
		
		answer = object.greet("Mehmet");
		System.out.println(answer);

		System.out.println("World of the object: " + object.world);

		answer = object.greet("");
		System.out.println(answer);
	}
}

