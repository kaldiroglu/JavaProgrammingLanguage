package org.javaturk.jp.ch16.noConst;

class Tree {
    String type;
    float height;

    void printInfo() {
        System.out.println("\nTree Info:");
        System.out.println("Type: " + type);
        System.out.println("Height: " + height);
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.printInfo(); // Not a meaningful state!
        tree.type = "Oak";
        tree.height = 8.74f;
        tree.printInfo(); // Meaningful state!

        Tree tree2 = new Tree();
        tree2.height = 5;
        tree2.printInfo();
    }
}
