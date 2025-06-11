package org.javaturk.jp.ch17.call;

public class Tree {

    String type;
    float height;

    public Tree(String newType, float newHeight) {
//      Not here!
//      printInfo();
        type = newType;
        height = newHeight;
        System.out.println("Tree(String newType, float newHeight)");
        printInfo();
    }

    Tree(String newType) {
        this(newType, 1.0f);
    }

    Tree(float newHeight) {
        this("Pine", newHeight);
    }

    Tree() {
//      Not here !
//      printInfo();
        this("Pine", 1.0f);
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
