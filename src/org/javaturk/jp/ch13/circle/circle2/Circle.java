package org.javaturk.jp.ch13.circle.circle2;

public class Circle {

    double calculateArea(float radius) {
        return 2 * Math.PI * radius;
    }

    double calculateCircumference(float radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
