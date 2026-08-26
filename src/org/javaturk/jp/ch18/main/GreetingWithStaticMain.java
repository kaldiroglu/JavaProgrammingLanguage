package org.javaturk.jp.ch18.main;

import java.util.Random;

class GreetingWithStaticMain {
    static Random random = new Random();
    static String start = "*** Greeting Example ***";
    static Selam s = new Selam();
    static Hello h = new Hello();

    static void main() {
        System.out.println(start);
        saySalam();
        sayHello();
    }

    static void saySalam() {
        int limit = random.nextInt(10);
        for (int i = 0; i < limit; i++)
            System.out.println(s.saySalam("Nalan"));

    }

    static void sayHello() {
        int limit = random.nextInt(10);
        for (int i = 0; i < limit; i++)
            System.out.println(h.sayHello("Jane"));
    }
}


 

