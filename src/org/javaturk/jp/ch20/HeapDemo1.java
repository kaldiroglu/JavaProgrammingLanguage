package org.javaturk.jp.ch20;

import java.util.Scanner;

import static org.javaturk.jp.ch20.MemoryUtil.getMemory;

public class HeapDemo1 {
	public static void main(String[] args) {
		getMemory();
		System.out.println("**********************");
		System.out.println("Enter number of objects:");
		long objectCount = new Scanner(System.in).nextLong() ;
		run(objectCount);
	}

	public static void run(long objectCount) {
		System.out.println("At the beginning.");
		getMemory();
		for (long i = 1; i <= objectCount; i++) {
			Person person = new Person("TCKN" + i, "Akin" + i, "Kaldiroglu" + i, "Address" + i, "Phone" + i, "CellPhone" + i);
			Car car = new Car(i, "Turkey" + i, "Personal car" + i, "Mercedes" + i, "CLK200" + i, "2024" + i, i, i, person);

			if (i % 1_000_000 == 0) {
				System.out.println("\nObject count: " + (2 * i));
				getMemory();
			}
		}
		System.out.println("Done!");
		getMemory();
	}
}
