package org.javaturk.ioop.ch17.problem.car;

public class Car1 {
    public String make;
    public String model;
    public String year;
    public int speed;
    public int distance;
    public String color;

    public Car1(String make, String model, String year, int speed, int distance) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.distance = distance;
    }

    public static void main(String[] args) {
        Car1 car = new Car1("Mercedes", "E200", "2024", 0, 0);
    }
}

