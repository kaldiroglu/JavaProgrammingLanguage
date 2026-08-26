package org.javaturk.jp.ch16.argConst;

class Tree {
	String type;
	float height;

//	Tree() {
//		type = "Pine";
//		height = 1.0f;
//		System.out.println("\n*** Creating a Tree object! ***");
//	}

	Tree(String newType, float newHeight) {
		type = newType;
		height = newHeight;
	}

	void printInfo() {
		System.out.println("\nTree Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}
	
	public static void main(String[] args) {
		Tree tree1 = new Tree("Pine", 2.0f);
		// Following is not a good practice. Use constructor!
//		tree1.height = 5.5f;
//		tree1.type = "Goknar";
		tree1.printInfo();

		Tree tree2 = new Tree("Goknar", 5.5f);
		tree2.printInfo();

		Tree tree3 = new Tree(null, 5.5f);
		tree3.printInfo();
		
//		Tree tree4 = new Tree();
//		tree4.printInfo();
	}
}
