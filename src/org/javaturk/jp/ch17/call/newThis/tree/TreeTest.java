package org.javaturk.jp.ch17.call.newThis.tree;

class TreeTest {
    public static void main(String[] args) {
        Tree tree1 = new Tree("Cedar", 2.0f);
        Tree tree2 = new Tree("Oak");
        Tree tree3 = new Tree(5);
        Tree tree4 = new Tree();

        // Following throws an exception
//        Tree tree4 = new Tree(null);
//        Tree tree2 = new Tree(-7);
    }
}
