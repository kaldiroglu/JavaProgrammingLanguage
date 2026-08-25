package org.javaturk.jp.solution.ch20;

/**
 * Homework 2 — why HeapDemo1 stays flat while HeapDemo2.run1() climbs.
 *
 * Both loops create exactly the same objects. The only difference is whether a
 * reference to each one is stored somewhere that outlives the loop turn.
 *
 * In HeapDemo2.run1() that line is  list.add(car);
 * here it is                        kept[i] = block;
 *
 * On slide 15 the kept blocks land in the intersection "no longer used, but
 * still referenced" — which is the definition of a leak.
 */
class ShortVsLongLived {

    static byte[][] kept;

    static void shortLived(int blocks) {
        for (int i = 0; i < blocks; i++) {
            byte[] block = new byte[1024 * 1024];
            block[0] = 1;
            // No reference is stored. The block is garbage on the next turn.
        }
    }

    static void longLived(int blocks) {
        kept = new byte[blocks][];
        for (int i = 0; i < blocks; i++) {
            byte[] block = new byte[1024 * 1024];
            block[0] = 1;
            kept[i] = block;   // <-- the one line that changes everything
        }
    }

    public static void main(String[] args) {
        MemoryProbe.show("at the start");
        shortLived(300);
        MemoryProbe.show("after 300 short lived blocks");
        longLived(150);
        MemoryProbe.show("after 150 long lived blocks");
    }
}
