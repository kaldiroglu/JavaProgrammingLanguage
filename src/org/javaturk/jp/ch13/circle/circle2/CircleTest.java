package org.javaturk.jp.ch13.circle.circle2;

public class CircleTest {

    public static void main(String[] args) {
        System.out.println("Circle Example - 2\n");

        Circle c = new Circle();

        double area = c.calculateArea(10);
        System.out.println("Area: " + area);

        double circumference = c.calculateCircumference(20);
        System.out.println("Circumference: " + circumference);
    }
}
