package org.javaturk.jp.hw.ch12.circle.circle1;

public class CircleTest {

    public static void main(String[] args) {
        System.out.println("Circle Example - 1\n");

        Circle c = new Circle();

        double area = c.calculateArea(10);
        System.out.println("Area: " + area);

        double circumference = c.calculateCircumference(100);
        System.out.println("Circumference: " + circumference);
    }
}
