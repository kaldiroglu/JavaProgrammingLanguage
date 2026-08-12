package org.javaturk.jp.ch12;

public class Car{
	 String make;
	 String model;
	 String year;
	 int speed;
	 int distance;

	public void accelerate(int newSpeed) {
		speed = newSpeed;
	}

	public double go(int newDistance) {
		distance += newDistance;
		double period = (double ) newDistance / speed;
		return period;
	}

	public void stop() {
		speed = 0;
	}

	public String info() {
		String info = "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at " + speed + " kmph.";
		return info;
	}
}
