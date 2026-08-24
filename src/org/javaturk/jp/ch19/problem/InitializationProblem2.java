package org.javaturk.jp.ch19.problem;

import java.time.LocalTime;

class InitializationProblem2 {
    int ratio;

    double coefficient;

    InitializationProblem2() {
        ratio = getRatioFromFile();
        ;
        LocalTime now = LocalTime.now();
        if (now.isBefore(LocalTime.MIDNIGHT))
            coefficient = 2 * (ratio + 1);
        else
            coefficient = 4 * (ratio - 1);
        // Using this() doesn't work gere
//		this(ratio);
    }

    InitializationProblem2(int ratio) {
        this.ratio = ratio;
        LocalTime now = LocalTime.now();
        if (now.isBefore(LocalTime.NOON))
            coefficient = 2 * ratio;
        else
            coefficient = 4 * ratio;
    }

    int getRatioFromFile() {
        return 2;
    }

    String getNameFromFile() {
        return "Default";
    }
}
