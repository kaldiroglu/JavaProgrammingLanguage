package org.javaturk.jp.ch15.calculator;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Calculator {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	void whoAreYou(){
		System.out.println("I'm a Calculator, my name is " + name);
	}

	public int add(int first, int second) {
		return first + second;
	}

	public int subtract(int first, int second) {
		return first - second;
	}

	public int multiply(int first, int second) {
		int sonuc =  first * second;
		return sonuc;
	}
	
	public int multiplyByAdding(int first, int second) {
		int multiplication = 0;
		for(int i = 1; i <= second; i++)
			multiplication += first;
		System.out.println("Multiplication: " + multiplication);
		return multiplication;
	}

	public double divide(int first, int second) {
		String s;
		return (double)first / second;
	}
}