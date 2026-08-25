package org.javaturk.jp.solution.ch20;

/**
 * Homework 3 — does setting a reference to null free the memory?
 * Homework 5 — run this again with -XX:+DisableExplicitGC and compare step 4.
 *
 * Four readings are printed. Compare 2, 3 and 4 before answering.
 */
class NullAndGc {

    static byte[][] kept;

    public static void main(String[] args) {
        MemoryProbe.show("1. at the start");

        kept = new byte[150][];
        for (int i = 0; i < kept.length; i++) {
            kept[i] = new byte[1024 * 1024];
            kept[i][0] = 1;
        }
        MemoryProbe.show("2. after 150 MB is kept");

        kept = null;                       // the object is now unreachable
        MemoryProbe.show("3. right after kept = null");

        System.gc();                       // only a hint - see slide 33
        MemoryProbe.show("4. after System.gc()");
    }
}
