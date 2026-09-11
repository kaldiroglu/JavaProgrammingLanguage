package org.javaturk.jp.ch19.error;

import java.time.LocalTime;

class MightAlreadyHaveBeenAssigned {
//    final int i;
    String s;

    {
        LocalTime now = LocalTime.now();
//        if (now.isBefore(LocalTime.NOON))
//            i = 2;
//        else
//            s = "Java";
//            i = 4;
    }

    MightAlreadyHaveBeenAssigned() {
//        i = 5; // Uncomment this line to see: Variable 'i' might already have been assigned to
    }
}
