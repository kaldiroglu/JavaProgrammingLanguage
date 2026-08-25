package org.javaturk.jp.solution.ch20;

/**
 * Homework 1 — a measuring tool of our own.
 *
 * Runtime offers maxMemory(), totalMemory() and freeMemory(). There is no
 * usedMemory(): it has to be computed as total - free.
 *
 * Mapping to the three terms on slide 20:
 *     Max  -> Runtime.maxMemory()     the ceiling the JVM may grow to
 *     Size -> Runtime.totalMemory()   what the JVM holds right now
 *     Used -> total - free            what is actually occupied
 */
class MemoryProbe {

    static final double MB = 1024 * 1024;
    static final Runtime RUNTIME = Runtime.getRuntime();

    static double maxMB() { return RUNTIME.maxMemory() / MB; }

    static double sizeMB() { return RUNTIME.totalMemory() / MB; }

    static double freeMB() { return RUNTIME.freeMemory() / MB; }

    // No Runtime method returns this directly.
    static double usedMB() { return (RUNTIME.totalMemory() - RUNTIME.freeMemory()) / MB; }

    static void show(String label) {
        System.out.printf("%-32s Max: %7.1f  Size: %7.1f  Used: %7.1f MB%n",
                label, maxMB(), sizeMB(), usedMB());
    }

    public static void main(String[] args) {
        show("at the start");
        byte[] block = new byte[64 * 1024 * 1024];
        block[0] = 1;
        show("after a 64 MB allocation");
    }
}
