package org.javaturk.ioop.ch20.problem;

import java.time.LocalTime;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      Problem of this approach is duplicating initialization method call into constructors.
 */
public class InitializationProblem3 {
	String name;

	double coefficient;
	int ratio;

	InitializationProblem3() {
		name = "default";
		initializeCoefficient();
	}

	InitializationProblem3(String name) {
		this.name = name;
		initializeCoefficient();
	}

	InitializationProblem3(String name, int i) {
		this.name = name;
		//initializeCoefficient();
	}
	
	void initializeCoefficient() {
		LocalTime now = LocalTime.now();
		if (now.isBefore(LocalTime.NOON))
			coefficient = 2;
		else
			coefficient = 4;
	}
}
