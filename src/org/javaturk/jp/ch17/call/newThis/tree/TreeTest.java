package org.javaturk.jp.ch17.call.newThis.tree;

/**
 * This code does not compile with JDK 21, it does with JDK 25.
 */
class TreeTest {
    public static void main(String[] args) {
        Tree tree1 = new Tree("Pine");
//        Tree tree2 = new Tree(5);
//        Tree tree3 = new Tree();

        // Following throws an exception
//        Tree tree4 = new Tree(null);
//        Tree tree2 = new Tree(-7);
    }
}
