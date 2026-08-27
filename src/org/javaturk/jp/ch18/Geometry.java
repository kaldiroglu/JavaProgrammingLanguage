package org.javaturk.jp.ch18;

class Geometry {

    static final double PI = Math.PI;

    public static void main(String[] args) {
        System.out.println(Geometry.calculateAreaOfCircle(10));
        System.out.println(Geometry.calculateAreaOfRectangle(10, 8));
        System.out.println(Geometry.calculateAreaOfTriangle(5, 9));

        // Thinking the instances of Geometry is hard, even impossible!
//        Geometry geometry1 = new Geometry();
//        System.out.println(geometry1.calculateAreaOfCircle(10));
//        Geometry geometry2 = new Geometry();
//        System.out.println(geometry2.calculateAreaOfCircle(10));
    }

    static double calculateAreaOfCircle(double radius) {
        return PI * radius * radius;
    }

    static double calculateCircumferenceOfCircle(double radius) {
        return 2 * PI * radius;
    }

    static double calculateAreaOfRectangle(double width, double length) {
        return width * length;
    }

    static double calculateAreaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }
}
