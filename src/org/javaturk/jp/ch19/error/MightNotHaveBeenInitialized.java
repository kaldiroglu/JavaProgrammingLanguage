package org.javaturk.jp.ch19.error;

import java.time.LocalTime;

class MightNotHaveBeenInitialized {
//    final int i; // Uncomment this line to see: i might not have been initialized
    String s;

    {
        LocalTime now = LocalTime.now();
//        if (now.isBefore(LocalTime.NOON))
//            i = 2;
//        else
//            s = "Hello Java :)";
        //  i = 5;
    }
}
