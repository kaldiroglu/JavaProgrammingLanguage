package org.javaturk.jp.hw.ch13;

/**
 * Solutions to homework 1 and homework 2.
 *
 * Homework 1 creates one object with all four steps together and a second one
 * with the declaration split away from the rest.
 *
 * Homework 2 shows that assigning a reference to another reference copies the
 * reference, not the object.
 */
class SongTest {

	public static void main(String[] args) {

		// ---------- Homework 1a: all four steps on one line ----------
		// Declaration, instantiation, initialization and assignment together.
		Song song1 = new Song();
		song1.title = "Bohemian Rhapsody";
		song1.artist = "Queen";
		song1.durationInSeconds = 355;
		song1.favorite = true;

		System.out.println("Homework 1a");
		System.out.println("  " + song1.title + " by " + song1.artist
				+ ", " + song1.durationInSeconds + " seconds");

		// ---------- Homework 1b: step 1 here, steps 2, 3 and 4 later ----------
		Song song2;                    // Step 1: declaration only, no object yet

		// ---------- Homework 1c: reading song2 here does not compile ----------
		// Uncomment the next line and the compiler refuses the whole file:
		//
		//     error: variable song2 might not have been initialized
		//
		// A local variable is NOT null before it is assigned - it holds nothing
		// at all, and Java forbids reading it. Only a field would be null here.
		//
		// System.out.println(song2);

		song2 = new Song();            // Steps 2, 3 and 4 together
		song2.title = "Yesterday";
		song2.artist = "The Beatles";
		song2.durationInSeconds = 125;
		song2.favorite = false;

		System.out.println("\nHomework 1b");
		System.out.println("  " + song2.title + " by " + song2.artist
				+ ", " + song2.durationInSeconds + " seconds");

		// ---------- Homework 2: two references, one object ----------
		Song song3 = song2;            // No new object is created here

		song3.title = "Hey Jude";      // Changed through song3...
		song3.durationInSeconds = 431;

		System.out.println("\nHomework 2");
		System.out.println("  read through song2: " + song2.title
				+ ", " + song2.durationInSeconds + " seconds");
		System.out.println("  read through song3: " + song3.title
				+ ", " + song3.durationInSeconds + " seconds");
		System.out.println("  There is one object and there are two references to it.");
	}
}
