package org.javaturk.jp.ch17.call.problem;

class ThisProblems {
    String name;
    int count;

    ThisProblems() {
//		this(); // Recursive call
//		System.out.println("ThisProblems()");
//		this("ThisProblems");
        this(3); // Must be the first statement in the constructor.

    }

    ThisProblems(String name) {
        this(name, 5); // Recursive constructor call.
    }

    ThisProblems(int count) {
        this.count = count;
    }

    ThisProblems(String name, int count) {
//		this(name); // Recursive constructor call.
    }
}
