package org.javaturk.jp.ch14.car.composite;

class Car {
	String make;
	String model;
	String year;
	int speed;
	int distance;
	
	// Owner of the car
	Person owner;
	
	 void go(int newDistance){
		distance += newDistance;
	}
	
	 void accelerate(int newSpeed){
		speed = newSpeed;
	}
	
	 void stop(){
		speed = 0;
	}
	
	 String getInfo(){
		String info = "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at " + speed + " kmph.";
		if(owner != null)
			info += " And its owner is " + owner.firstName + " " + owner.lastName;
		else
			info += " And it does not have an owner!";
		return info;
	}
}
