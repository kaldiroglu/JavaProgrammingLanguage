package org.javaturk.jp.ch20;

public class Car {
	long id;
	String country;
	String usage;
	String make;
	String model;
	String year;
	long speed;
	long distance;
	Person owner;

	public Car(long id, String country, String usage, String make, String model, String year, long speed, long distance,
			Person owner) {
		this.id = id;
		this.country = country;
		this.usage = usage;
		this.make = make;
		this.model = model;
		this.year = year;
		this.speed = speed;
		this.distance = distance;
		this.owner = owner;
	}

	public void go(int newDistance) {
		distance += newDistance;
	}

	public void accelerate(int newSpeed) {
		speed = newSpeed;
	}

	public void stop() {
		speed = 0;
	}
	
	public long getId(){
		return id;
	}
}
