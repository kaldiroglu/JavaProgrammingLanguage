package org.javaturk.jp.ch02;

import java.time.LocalTime;

class Class{
    double coefficient;
    double ratio;
    Class() {
        double fileRatio = getFromFile();   // a local variable, not the field
        this(fileRatio);                    // Java 25: statements may come before this(...)
    }
    Class(double ratio) {
        this.ratio = ratio;
        LocalTime now = LocalTime.now();
        if(now.isBefore(LocalTime.NOON))
            coefficient = 2 * ratio;
        else
            coefficient = 4 * ratio;
    }
    static double getFromFile() {         // static: the object does not exist yet
        return 1.0;
    }
}