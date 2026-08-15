package org.javaturk.jp.ch15.calculator;

class CalculatorTest {

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