package org.javaturk.jp.ch16.problem.car;

class Car2 {
    public String make;
    public String model;
    public String year;
    public int speed;
    public int distance;
    // Added later
    public String color;
    public boolean convertible;

    // No initialization for color and convertible
    public Car2(String newMake, String newModel, String newYear, int newSpeed, int newDistance) {
        make = newMake;
        model = newModel;
        year = newYear;
        speed = newSpeed;
        distance = newDistance;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public void setConvertible(boolean newConvertible) {
        convertible = newConvertible;
    }

    public static void main(String[] args) {
        Car2 car = new Car2("Mercedes", "E200", "2024", 0, 0);
        car.setColor("Blue");
        car.setConvertible(true);
    }
}

