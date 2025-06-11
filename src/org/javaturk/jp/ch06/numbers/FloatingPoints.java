package org.javaturk.jp.ch06.numbers;

public class FloatingPoints {

    public static void main(String[] args) {
        double doublePi = 3.141592653589793238462643383279502884197; // Pi with 39 decimal digits
        System.out.println("doublePi: " + doublePi);
        System.out.printf("doublePi: %2.40f\n", doublePi);

        float floatPi = 3.141592653589793238462643383279502884197F; // Pi with 39 decimal digits
        System.out.println("floatPi: " + floatPi);
        System.out.printf("floatPi: %2.40f\n", floatPi);

        doublePi = 22.0/7;
        System.out.println("doublePi: " + doublePi);
        System.out.printf("doublePi: %2.40f\n", doublePi);
    }
}
