package org.javaturk.jp.ch17.call.problem;

public class Tree {

	String type;
	float height;

	public Tree(String newType, float newHeight) {
		type = newType;
		height = newHeight;
	}

	Tree(String newType) {
		type = newType;
		height = 1.0f;
	}

	Tree(float newHeight) {
		type = "Pine";
		height = newHeight;
	}

	Tree() {
		type = "Pine";
		height = 1.0f;
	}

	public void printInfo() {
		
		System.out.println("\nTree Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}

	public static void main(String[] args) {
		Tree tree1 = new Tree("Pine", 2.0f);
		tree1.printInfo();

		Tree tree2 = new Tree("Oak");
		tree2.printInfo();

		Tree tree3 = new Tree(8.0f);
		tree3.printInfo();

		Tree tree4 = new Tree();
		tree4.printInfo();
	}
}
