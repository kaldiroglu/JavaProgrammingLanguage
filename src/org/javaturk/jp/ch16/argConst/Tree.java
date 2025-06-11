package org.javaturk.ioop.ch17.argConst;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
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
