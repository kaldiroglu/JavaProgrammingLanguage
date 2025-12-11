package org.javaturk.jp.ch16.argConst;

public class Tree {
	String type;
	float height;
	
	Tree(final String newType, final float newHeight) {
		type = newType;
		height = newHeight;
	}

	public void printInfo() {
		System.out.println("\nTree Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}
	
	public static void main(String[] args) {
		Tree tree1 = new Tree("Pine", 2.0f);
//		tree1.height = 20;
		tree1.type = "Goknar";
		tree1.printInfo();

		Tree tree2 = new Tree("Oak", 5.5f);
		tree2.printInfo();

		Tree tree3 = new Tree(null, 5.5f);
		tree3.printInfo();
		
//		Tree tree3 = new Tree();
	}
}
