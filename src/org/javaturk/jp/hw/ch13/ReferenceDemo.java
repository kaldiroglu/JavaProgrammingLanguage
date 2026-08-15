package org.javaturk.jp.hw.ch13;

/**
 * Solution to homework 3.
 *
 * The four lines of the question are run one at a time, with the state of the
 * world printed after each one. Each object carries a distinct title so it can
 * be told apart through whichever reference still reaches it.
 */
class ReferenceDemo {

	public static void main(String[] args) {

		// Line 1: one object is created, one reference points at it.
		Song s1 = new Song();
		s1.title = "First";
		System.out.println("After line 1");
		System.out.println("  objects: 1, references: 1");
		System.out.println("  s1 -> " + s1.title);

		// Line 2: a second object, a second reference.
		Song s2 = new Song();
		s2.title = "Second";
		System.out.println("\nAfter line 2");
		System.out.println("  objects: 2, references: 2");
		System.out.println("  s1 -> " + s1.title + ", s2 -> " + s2.title);

		// Line 3: s1 is repointed at the second object. No object is created
		// or destroyed, but the first object now has no reference left.
		s1 = s2;
		System.out.println("\nAfter line 3");
		System.out.println("  objects: 2, references: 2 - but both point at the same one");
		System.out.println("  s1 -> " + s1.title + ", s2 -> " + s2.title);
		System.out.println("  \"First\" can no longer be reached from anywhere.");

		// Line 4: s2 points at nothing. The second object is still reachable
		// through s1, so it is not lost.
		s2 = null;
		System.out.println("\nAfter line 4");
		System.out.println("  s1 -> " + s1.title);
		System.out.println("  s2 -> " + s2);
		System.out.println("  The object survives because s1 still reaches it.");

		// Reading a field through a null reference fails while the program runs.
		// It compiles, unlike the unassigned local variable in homework 1c.
		//
		// System.out.println(s2.title);
	}
}
