package org.javaturk.ioop.ch17.problem;

public class Tree {

	String type;
	float height;

	Tree(String newType, float newHeight) {
		printInfo();	// That's problem!
		type = newType;
		height = newHeight;
		printInfo(); // That's not problem!
	}

	public void printInfo() {
		System.out.println("\nTree Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}

	public static void main(String[] args) {
		Tree tree = new Tree("Pine", 2.0f);
		tree.printInfo();
	}
}
