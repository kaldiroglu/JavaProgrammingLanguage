package org.javaturk.jp.ch17.call.newThis.tree;

class Tree {

    String type;
    float height;

    Tree(String newType, float newHeight) {
        if (newType != null && newHeight >= 0) {
            type = newType;
            height = newHeight;
        }
    }

    Tree(String newType) {
        System.out.println("Received a type: " + newType);
//        System.out.println(height);
//        height = 5;
//        System.out.println(height);
        if (newType == null)
            throw new IllegalArgumentException("Type cannot be null!");
        this(newType, 1.0f);
        System.out.println(height);
    }

    Tree(float newHeight) {
        System.out.println("Received a height: " + newHeight);
        if (newHeight <= 0)
            throw new IllegalArgumentException("Height can’t be negative!");
        this("Pine", newHeight);
    }

//    Tree() {
//        System.out.println("No arguments!");
//        String newType = "Pine";
//        float newHeight = 1.0f;
//        this(newType, newHeight);
//    }

    Tree() {
        System.out.println("No arguments!");
//        System.out.println(height); // Can't reference an instance variable
        height = 5; // But it can be assigned
        String newType = "Pine";
        float newHeight = 1.0f;
        this(newType, newHeight);
    }
}
