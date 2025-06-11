package org.javaturk.jp.ch24.size;

import static org.javaturk.jp.ch24.size.Size.MEDIUM;

public class Sizes {
	public static void main(String[] args) {
//	initialize();
		sizes();
	}

	public static void initialize(){
		Size size1 = Size.LARGE;
	}

	public static void sizes(){
		Size size1 = Size.LARGE;
		String name = size1.name();
		System.out.println("\nEnum: " + name + " - " + size1);
		System.out.println("Ordinal: " + size1.ordinal());
		System.out.println("Abbreviation: " + size1.getAbbreviation());
		System.out.println("No: " + size1.getNo());

		System.out.println();

		Size size2 = MEDIUM;
		String name2 = size2.name();
		System.out.println("Enum: " + name2 + " - " + size2);
		System.out.println("Ordinal: " + size2.ordinal());
		System.out.println("Abbreviation: " + size2.getAbbreviation());
		System.out.println("No: " + size2.getNo());

		System.out.println(Size.getDescription());

		Size size = Size.getSizeForAbbreviation("XL");
		System.out.println(size);

		Size[] allSizes = Size.values();
		for(Size s : allSizes)
			System.out.println(s);
	}
}
