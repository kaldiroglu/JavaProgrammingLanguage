package org.javaturk.jp.ch12;

class Car {
    String make;
    String model;
    String year;
    int speed;
    int distance;

    void accelerate(int newSpeed) {
        speed = newSpeed;
    }

    double go(int newDistance) {
        distance += newDistance;
        double period = (double) newDistance / speed;
        return period;
    }

    void stop() {
        speed = 0;
    }

    String info() {
        String info = "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at " + speed + " kmph.";
        return info;
    }
}
