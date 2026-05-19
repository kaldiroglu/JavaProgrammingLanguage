package org.javaturk.jp.ch06.numbers;

public class FPBinaryConverter {
    public static void main(String[] args) {
        printBinary(0.625);
        // Use 0.1 to see the infinite repeating pattern differences
        printBinary(0.1);
        printBinary(1.0/3.0);
    }

    static void printBinary(double number) {
        System.out.println("\nDecimal Value: " + number);

        // 1. Show the MATH (Successive Multiplication)
        System.out.println("Manual (32 iterations):   " + toManualFraction(number, 32));
        System.out.println("Manual (64 iterations):   " + toManualFraction(number, 64));

        // 2. Show the HARDWARE (IEEE 754 Standard)
        System.out.println("IEEE 754 (32-bit Float):  " + toLibrary32((float) number));
        System.out.println("IEEE 754 (64-bit Double): " + toLibrary64(number));
    }

    // This calculates the 0.00011... representation
    static String toManualFraction(double number, int precision) {
        StringBuilder sb = new StringBuilder("0.");
        double fraction = number;

        for (int i = 0; i < precision; i++) {
            fraction *= 2;
            int bit = (int) fraction;
            sb.append(bit);
            fraction -= bit;
            if (fraction == 0) break;
        }
        return sb.toString();
    }

    // Correctly padded 32-bit representation
    static String toLibrary32(float number) {
        int bits = Float.floatToRawIntBits(number);
        return String.format("%32s", Integer.toBinaryString(bits)).replace(' ', '0');
    }

    // Correctly padded 64-bit representation
    static String toLibrary64(double number) {
        long bits = Double.doubleToRawLongBits(number);
        return String.format("%64s", Long.toBinaryString(bits)).replace(' ', '0');
    }
}