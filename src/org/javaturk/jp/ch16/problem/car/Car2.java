package org.javaturk.jp.ch16.problem.car;

public class Car2 {
    public String make;
    public String model;
    public String year;
    public int speed;
    public int distance;
    // Added later
    public String color;
    public boolean convertible;

    // // No initialization for color and convertible
    public Car2(String make, String model, String year, int speed, int distance) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.distance = distance;
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

