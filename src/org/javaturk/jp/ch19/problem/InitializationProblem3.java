package org.javaturk.jp.ch19.problem;

import java.time.LocalTime;

/**
 * This illustrates the problem of assigning an initial value to coefficient.
 * We can use initialization methods to avoid code duplication and call them from within the constructors.
 * But that is risky too, calling those methods can easily be forgotten, especially in new constructorsç
 */
class InitializationProblem3 {
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
