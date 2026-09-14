package org.javaturk.jp.ch24.size;

import static org.javaturk.jp.ch24.size.Size.MEDIUM;
import static org.javaturk.jp.ch24.size.Size.UNKNOWN;

public class Sizes {
    public static void main(String[] args) {
//		initialize();
        sizes();
    }

    public static void initialize() {
        Size size = Size.LARGE;
    }

    public static void sizes() {
        Size size = Size.LARGE;
        printInfo(size);

        System.out.println();

        size = MEDIUM;
        printInfo(size);

        System.out.println();

        size = UNKNOWN;
        printInfo(size);

        System.out.println(Size.getDescription());

        size = Size.getSizeForAbbreviation("XL");
        System.out.println(size);

        Size[] allSizes = Size.values();
        for (Size s : allSizes)
            System.out.println(s);
    }

    static void printInfo(Size size) {
        System.out.println("Size Information:");
        System.out.println("Size: " + size);
        String name = size.name();
        System.out.println("Enum: " + size + " - " + size);
        System.out.println("Ordinal: " + size.ordinal());
        System.out.println("Abbreviation: " + size.getAbbreviation());
        System.out.println("No: " + size.getNo());
    }
}
