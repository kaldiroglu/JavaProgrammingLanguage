package org.javaturk.jp.ch15.constant;

class Car {
    String make;
    String model;
    String year;
    int speed;
    int distance;

    String owner;

    // final parameter
    void speedUp(final int newSpeed) {
//		Can't do that
//		newSpeed *= 2;
        speed = newSpeed;
    }

    void setOwner(final String newOwner) {
//		Can't do that
//		newOwner = "Selim Efe";
        owner = newOwner;
    }
}
