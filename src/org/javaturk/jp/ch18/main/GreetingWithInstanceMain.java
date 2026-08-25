package org.javaturk.jp.ch18.main;

import java.util.Random;

class GreetingWithInstanceMain {

    Random random = new Random();
    String start = "*** Greeting Example ***";
    Selam s = new Selam();
    Hello h = new Hello();

    void main() {
        System.out.println(start);
        saySalam();
        sayHello();
    }

    void saySalam() {
        int limit = random.nextInt(10);
        for (int i = 0; i < limit; i++)
            System.out.println(s.saySalam("Nalan"));

    }

    void sayHello() {
        int limit = random.nextInt(10);
        for (int i = 0; i < limit; i++)
            System.out.println(h.sayHello("Jane"));
    }
}


 

