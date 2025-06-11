package org.javaturk.jp.ch15.constant;

public class FinalParameter {

	public static void main(String[] args) {
//		Car is a final reference
		final Car car;
		
//		Can do this only if car is not defined above!
		car = new Car();
		car.make = "Mercedes";
		car.model = "E200";
		car.year = "2011";
		car.speed = 80;
		car.distance = 30_000;
		
//		Can't do this
//		car = new Car();

		car.speedUp(80);
		car.setOwner("Zeynep");

		aMethod(3, "java");
	}

	static void aMethod(final int arg1, final String arg2){
		System.out.println(arg1 + " " + arg2);
	}
}
