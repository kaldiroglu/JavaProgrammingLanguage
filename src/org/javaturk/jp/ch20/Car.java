package org.javaturk.jp.ch20;

class Car {
    long id;
    String country;
    String usage;
    String make;
    String model;
    String year;
    long speed;
    long distance;
    Person owner;

    Car(long id, String country, String usage, String make, String model, String year, long speed, long distance,
        Person owner) {
        this.id = id;
        this.country = country;
        this.usage = usage;
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.distance = distance;
        this.owner = owner;
    }

    void go(int newDistance) {
        distance += newDistance;
    }

    void accelerate(int newSpeed) {
        speed = newSpeed;
    }

    void stop() {
        speed = 0;
    }

    long getId() {
        return id;
    }
}
