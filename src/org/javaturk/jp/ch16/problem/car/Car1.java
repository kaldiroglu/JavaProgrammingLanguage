package org.javaturk.jp.ch16.problem.car;

class Car1 {
    String make;
    String model;
    String year;
    int speed;
    int distance;

    Car1(String newMake, String newModel, String newYear, int newSpeed, int newDistance) {
        make = newMake;
        model = newModel;
        year = newYear;
        speed = newSpeed;
        distance = newDistance;
    }

    public static void main(String[] args) {
        Car1 car = new Car1("Mercedes", "E200", "2024", 0, 25500);
    }
}

