package org.javaturk.jp.ch16;

class TreesWithoutReferences {
	private String type;
	private float height;

	public TreesWithoutReferences(String newType, float newHeight) {
		System.out.println("in TreesWithoutReferences");
		type = newType;
		height = newHeight;
	}

	public void printInfo() {
		System.out.println("\nTree Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}

	public static void main(String[] args) {
		new TreesWithoutReferences("Pine", 5.0f);
		// Can't reach the object created above, Pine at 5 height!

		TreesWithoutReferences t = new TreesWithoutReferences("Pine", 5.0f);
		System.out.println("Height: " + t.height + " m.");

		for (int i = 0; i < 5; i++) {
			t = new TreesWithoutReferences("Pine", i);
			System.out.println("Height: " + t.height + " m.");
		}

		System.out.println("Height: " + t.height + " m.");

		new TreesWithoutReferences("Pine", 5).printInfo();

		TreesWithoutReferences tt1;
//		tt1.printInfo();;

		TreesWithoutReferences tt2 = null;
//		tt2.printInfo();
	}
}
