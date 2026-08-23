package org.javaturk.jp.ch18;

class Geometry {

    static final double PI = Math.PI;

    public static void main(String[] args) {
        System.out.println(Geometry.calculateAreaOfCircle(10));
        System.out.println(Geometry.calculateAreaOfARectangle(10, 8));
        System.out.println(Geometry.calculateAreaOfATriangle(5, 9));
    }

    static double calculateAreaOfCircle(double radius) {
        return PI * radius * radius;
    }

    static double calculateCircumferenceOfCircle(double radius) {
        return 2 * PI * radius;
    }

    static double calculateAreaOfARectangle(double width, double length) {
        return width * length;
    }

    static double calculateAreaOfATriangle(double base, double height) {
        return 0.5 * base * height;
    }
}
