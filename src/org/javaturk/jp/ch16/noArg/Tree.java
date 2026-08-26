package org.javaturk.jp.ch16.noArg;

class Tree {
    String type;
    float height;

    Tree() {
        type = "Pine";
        height = 1.0f;
        System.out.println("\n*** Creating a Tree object! ***");
    }

    void printInfo() {
        System.out.println("\nTree Info:");
        System.out.println("Type: " + type);
        System.out.println("Height: " + height);
    }

    public static void main(String[] args) {
        Tree tree1 = new Tree();
        // Meaningful state!
        tree1.printInfo();

        Tree tree2 = new Tree();
        tree2.printInfo();

        tree1.type = "Oak";
        tree1.height = 8.74f;
        tree1.printInfo();
    }
}
