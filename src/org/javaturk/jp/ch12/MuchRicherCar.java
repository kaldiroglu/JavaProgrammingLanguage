package org.javaturk.jp.ch12;

public class MuchRicherCar {

    String make;
    String model;
    int year;
    int speed;
    int distance;
    boolean convertible;
    String color;

    double fuel;
    double fuelCapacity;

    boolean engineRunning;
    boolean headlightsOn;

    public void start() {
        engineRunning = true;
    }

    void accelerate(int newDistance) {
        requireEngineRunning();
        speed += newDistance;
    }

    public void brake(int amount) {
        speed = Math.max(0, speed - amount);
    }

    double go(int newDistance) {
        requireEngineRunning();

        double fuelUsed = newDistance * 0.08;
        fuel -= fuelUsed;
        distance += newDistance;
        return (double) newDistance / speed;
    }

    public void stop() {
        speed = 0;
        engineRunning = false;
    }

    public void refuel(double liters) {
        fuel = Math.min(fuelCapacity, fuel + liters);
    }

    public void turnHeadlightsOn() {
        headlightsOn = true;
    }

    public void turnHeadlightsOff() {
        headlightsOn = false;
    }

    private void requireEngineRunning() {
        if (!engineRunning) {
            System.out.println("Engine is not running");
            start();
        }

    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    boolean isConvertable(){
        return convertible;
    }

    public String info() {
        return "MuchRicherCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                ", distance=" + distance +
                ", fuel=" + fuel +
                ", fuelCapacity=" + fuelCapacity +
                ", engineRunning=" + engineRunning +
                ", headlightsOn=" + headlightsOn +
                '}';
    }
}