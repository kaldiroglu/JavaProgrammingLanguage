package org.javaturk.jp.ch17.call.problem;

public class ThisProblems {
	String name;
	int count;
	
	public ThisProblems() {
//		this(); // Recursive call
//		System.out.println("ThisProblems()");
//		this("ThisProblems");
		this(3); // Must be the first statement in the constructor.

	}
	
	public ThisProblems(String name) {
		this(name, 5); // Recursive constructor call.
	}
	
	public ThisProblems(int count) {
		this.count = count;
	}

	public ThisProblems(String name, int count) {
//		this(name); // Recursive constructor call.
	}
}
