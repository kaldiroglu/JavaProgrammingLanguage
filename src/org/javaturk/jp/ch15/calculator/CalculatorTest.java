package org.javaturk.jp.ch15.calculator;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class CalculatorTest {
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.setName("Texas Instruments T-308");
		
		calculator.whoAreYou();
		
		int i = calculator.add(12, 27);
		System.out.println("12 + 27 = " + i);
		
		double d = calculator.divide(82, 9);
		System.out.println("82 / 9 = " + d);
		
		System.out.println("83 - 56 = " + calculator.subtract(83, 56));
		System.out.println("8 * 7 = " + calculator.multiply(8, 7));
		
		// Calling it for its side effect
		calculator.multiplyByAdding(22, 5);

		int multiplication = calculator.multiplyByAdding(22, 5);
		System.out.println(multiplication);
		
//		System.out.println(calculator.power(2, 5));
// 		
//		System.out.println(calculator.mod(36, 5));
//		
//		System.out.println(calculator.factorial(5));
	}
}
//