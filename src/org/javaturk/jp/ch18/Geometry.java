package org.javaturk.ioop.ch19;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Geometry {

	static final double PI = Math.PI;

	public static void main(String[] args) {
		System.out.println(Geometry.calculateAreaOfCircle(10));
		System.out.println(Geometry.calculateAreaOfARectangle(10, 8));
		System.out.println(Geometry.calculateAreaOfATriangle(5, 9));
	}

	public static double calculateAreaOfCircle(double radius) {
		return PI * radius * radius;
	}

	public static double calculateCircumferenceOfCircle(double radius) {
		return 2 * PI * radius;
	}

	public static double calculateAreaOfARectangle(double width, double length) {
		return width * length;
	}

	public static double calculateAreaOfATriangle(double base, double height) {
		return 0.5 * base * height;
	}
}
