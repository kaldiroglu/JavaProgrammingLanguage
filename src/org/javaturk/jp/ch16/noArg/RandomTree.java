package org.javaturk.jp.ch16.noArg;

class RandomTree {
	String type;
	float height;

	RandomTree() {
		type = produceType();
		height = produceHeight();
	}

	RandomTree(String newType) {
		type = newType;
		height = produceHeight();
	}

	public void printInfo() {
		System.out.println("\nTree Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}

	static float produceHeight(){
		float randomHeight = 0;
		return (float) Math.random() * 10;
	}

	static String produceType(){
		String[] types ={"Oak", "Pine", "Olive", "Fir", "Eucalyptus", "Cedar","Walnut", "Maple", "Birch", "Poplar"};
		int index = (int) (Math.random() * 10);
		return types[index];
	}
	
	public static void main(String[] args) {
		RandomTree tree1 = new RandomTree();
		tree1.printInfo();

		RandomTree tree2 = new RandomTree("Oak");
		tree2.printInfo();
	}
}
