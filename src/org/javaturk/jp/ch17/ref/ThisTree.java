package org.javaturk.jp.ch17.ref;

class ThisTree {
    String type;
    float height;

    ThisTree(String type, float height) {
        this.type = type;
        this.height = height;
    }

    void printInfo() {
        System.out.println("\nTree Info:");
        this.printType(); // No need to use this here!
        this.printHeight(); // No need to use this here!
    }

    //	No need to use "this" here
    void printType() {
        System.out.println("Type: " + this.type);
    }

    //	No need to use "this" here
    void printHeight() {
        System.out.println("Height: " + this.height);
    }

    String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    float getHeight() {
        return height;
    }

    void setHeight(float height) {
        this.height = height;
    }

    public static void main(String[] args) {
        ThisTree tree = new ThisTree("Cinar", 12.0f);
        tree.printInfo();
    }
}
