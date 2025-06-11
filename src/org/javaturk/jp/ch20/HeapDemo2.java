package org.javaturk.jp.ch20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.javaturk.jp.ch20.MemoryUtil.getMemory;

public class HeapDemo2 {
    private static List list = new ArrayList();

    public static void main(String[] args) {
        System.out.println("Enter number of objects:");
        long objectCount = new Scanner(System.in).nextLong();
        run1(objectCount);
    }

    public static void run1(long objectCount) {
        System.out.println("At the beginning.");
        getMemory();
        for (long i = 1; i <= objectCount; i++) {
            Person person = new Person("TCKN" + i, "Akin" + i, "Kaldiroglu" + i, "Address" + i, "Phone" + i, "CellPhone" + i);
            Car car = new Car(i, "Turkey" + i, "Personal car" + i, "Mercedes" + i, "CLK200" + i, "2012" + i, i, i, person);
            list.add(car);
            if (i % 1_000_000 == 0) {
                System.out.println("Object count: " + (2 * i));
                getMemory();
            }
        }
        System.out.println("Done!");
        getMemory();
    }

    public static void run2(long objectCount) {
        System.out.println("At the beginning.");
        getMemory();
        for (long i = 1; i <= objectCount; i++) {
            Person person = new Person("TCKN" + i, "Akin" + i, "Kaldiroglu" + i, "Address" + i, "Phone" + i, "CellPhone" + i);
            Car car = new Car(i, "Turkey" + i, "Personal car" + i, "Mercedes" + i, "CLK200" + i, "2012" + i, i, i, person);
            list.add(car);

            if (i % 1_000_000 == 0) {
                System.out.println("Object count: " + (2 * i));
                double random = Math.random();
                if (random > 0.20)
                    list.clear();
                getMemory();
            }
        }
        System.out.println("Done!");
        getMemory();
    }
}
