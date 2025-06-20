package org.javaturk.jp.ch06.numbers;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>  
 */
public class FloatingPoint {

	public static void main(String[] args) {
		System.out.println("in doFPCalculation()");

		float fSum6 = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
		System.out.println("fSum6: " + fSum6);
		
		float fSum7 = fSum6 + 0.1f;
		System.out.println("fSum7: " + fSum7);
		
		float fSum8 = fSum7 + 0.1f;
		System.out.println("fSum8: " + fSum8);
		
		float fSum9 = fSum8 + 0.1f;
		System.out.println("fSum9: " + fSum9);
		
		float fSum10 = fSum9 + 0.1f;
		System.out.println("fSum10: " + fSum10);
		
		System.out.println();
		
		float f20 = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
		System.out.println("0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f = " + f20);
		System.out.println("Sum of 10 times 0.1 as float:  " + f20);
		
		double d20 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
		System.out.println("0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 = " + d20);
		System.out.println("Sum of 10 times 0.1 as double:  " + d20);
		
		System.out.println();
		
		float floatSum = 0.0f;

		for (int i = 0; i < 100; i++) {
			floatSum = floatSum + 0.1f;
		}

		System.out.println("Sum of 100 times 0.1 as float:  " + floatSum);
		
		double doubleSum = 0.0d;

		for (int i = 0; i < 100; i++) {
			doubleSum = doubleSum + 0.1;
		}

		System.out.println("Sum of 100 times 0.1 as double:  " + doubleSum);
		System.out.println();
		
		System.out.println("0.1 * 0.1 = " + (0.1d * 0.1d));
		System.out.println("0.3 - 0.2 = " + (0.3d - 0.2d));

		float fPi = 3.14F;
		double dPi = 3.14D;

		System.out.println("\nAre fPi and dPi equals: " + (fPi == dPi));
		System.out.printf("fPi: %30.25f   dPi: %30.25f ", fPi, dPi);

		float fOne = 1.0F;
		double dOne = 1.0D;

		System.out.println("\nAre fOne and dOne equals: " + (fOne == dOne));
		System.out.printf("fOne: %20.18f   dOne: %20.18f ", fOne, dOne);
	}
}
