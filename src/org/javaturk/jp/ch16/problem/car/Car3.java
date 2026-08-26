package org.javaturk.jp.ch16.problem.car;

class Car3 {
    String make;
    String model;
    String year;
    int speed;
    int distance;
    // Added later
    String color;
    boolean convertible;

    Car3(String newMake, String newModel, String newYear, int newSpeed, int newDistance) {
        make = newMake;
        model = newModel;
        year = newYear;
        speed = newSpeed;
        distance = newDistance;
        color = "";
    }

    // Parameters and initializations are added for color and convertible
    Car3(String newMake, String newModel, String newYear, int newSpeed, int newDistance, String newColor, boolean newConvertible) {
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
        Car3 car1 = new Car3("Mercedes", "E200", "2024", 0, 25500, "Blue", true);
//          car.setColor("Blue");
//          car.setConvertible(true);
        Car3 car2 = new Car3("Mercedes", "E200", "2024", 0, 25500);

    }
}
