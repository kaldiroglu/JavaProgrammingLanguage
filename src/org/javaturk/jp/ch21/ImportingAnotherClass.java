package org.javaturk.jp.ch21;

import org.*; // Only imports the classes under the package "org"

public class ImportingAnotherClass {
    AnotherClass anotherClass;

    public ImportingAnotherClass() {
        anotherClass = new AnotherClass();
//        javaturk.jp.ch21.MyClass myClass = new javaturk.jp.ch21.MyClass(); // Problem!
    }
}
