package org.javaturk.jp.ch16.problem.car;

class Car2 {
    String make;
    String model;
    String year;
    int speed;
    int distance;
    // Added later
    String color;
    boolean convertible;

    // No initialization for color and convertible
    Car2(String newMake, String newModel, String newYear, int newSpeed, int newDistance) {
        make = newMake;
        model = newModel;
        year = newYear;
        speed = newSpeed;
        distance = newDistance;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setConvertible(boolean newConvertible) {
        convertible = newConvertible;
    }

    public static void main(String[] args) {
        Car2 car = new Car2("Mercedes", "E200", "2024", 0, 0);
        car.setColor("Blue");
        car.setConvertible(true);
    }
}

