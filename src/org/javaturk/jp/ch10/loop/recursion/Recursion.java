package org.javaturk.jp.ch10.loop.recursion;

public class Recursion {

    static int counter = 0;

    public static void main(String[] args) {
        f();
    }

    static void f(){ // Recursive method
        counter++;
        System.out.println(counter);
        f();
    }
}
