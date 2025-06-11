package org.javaturk.ioop.ch17.problem.car;

public class Car3 {
    public String make;
    public String model;
    public String year;
    public int speed;
    public int distance;
    // Added later
    public String color;
    public boolean convertible;

    // Parameters and initializations are added for color and convertible
    public Car3(String make, String model, String year, int speed, int distance, String newColor, boolean newConvertible) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.distance = distance;
        // For new fields
        color = newColor;
        convertible = newConvertible;
    }

    public static void main(String[] args) {
        Car3 car = new Car3("Mercedes", "E200", "2024", 0, 0, "Blue", true);
//          car.setColor("Blue");
//          car.setConvertible(true);
    }
}
