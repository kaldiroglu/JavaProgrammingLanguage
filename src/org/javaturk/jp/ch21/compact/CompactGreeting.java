//package org.javaturk.jp.ch21.compact;

import org.javaturk.jp.ch21.compact.Hello;
import org.javaturk.jp.ch21.compact.Selam;

static Random random = new Random();
static String start = "*** Greeting Example ***";
static Selam s = new Selam();
static Hello h = new Hello();

void main() {
    System.out.println(start);
    saySalam("Fatma");
    sayHello("John");
}

void saySalam(String whom) {
    int limit = random.nextInt(10);
    for (int i = 0; i < limit; i++)
        System.out.println(s.saySalam(whom));

}

void sayHello(String whom) {
    int limit = random.nextInt(10);
    for (int i = 0; i < limit; i++)
        System.out.println(h.sayHello(whom));
}