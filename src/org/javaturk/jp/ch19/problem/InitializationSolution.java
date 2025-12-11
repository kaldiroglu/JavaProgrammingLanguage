package org.javaturk.jp.ch19.problem;

import java.time.LocalTime;
import java.util.Random;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This example shows how to use initializer block to solve all problems
 *      mentioned in InitializationProblem1, InitializationProblem2, InitializationProblem3 and
 *      InitializationProblem4 classes.
 * 
 */
public class InitializationSolution {
	String name;
	double coefficient;
	int ratio;

	{
		{
			double coefficient = 5;
		}
		name = "default";
		double coefficient = 5;
		LocalTime now = LocalTime.now();
		if (now.isBefore(LocalTime.NOON))
			this.coefficient = 2 * coefficient;
		else
			this.coefficient = 4 * (coefficient + 1);
	}

	static int i;

	// Think about where to put this block to initialize static var "ratio"
	// InitializationProblem1, InitializationProblem2 and InitializationProblem3
	// classes.
	static {
		int i;
		Random random = new Random();
		int randomInt = random.nextInt();
		randomInt = Math.abs(randomInt);
		double randomDouble = Math.random();
		if (randomDouble < 0.5)
			InitializationSolution.i = randomInt % 9;
		else
			InitializationSolution.i = randomInt % 5;
	}

	InitializationSolution() {
		
	}

	InitializationSolution(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		InitializationSolution ref = new InitializationSolution();
		System.out.println("i: " + i);
		System.out.println("coefficient: " + ref.coefficient);
	}
}
