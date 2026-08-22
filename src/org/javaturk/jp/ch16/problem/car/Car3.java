package org.javaturk.jp.ch16.problem.car;

class Car3 {
    public String make;
    public String model;
    public String year;
    public int speed;
    public int distance;
    // Added later
    public String color;
    public boolean convertible;

    // Parameters and initializations are added for color and convertible
    public Car3(String newMake, String newModel, String newYear, int newSpeed, int newDistance, String newColor, boolean newConvertible) {
        make = newMake;
        model = newModel;
        year = newYear;
        speed = newSpeed;
        distance = newDistance;

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
