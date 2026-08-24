package org.javaturk.jp.ch19.problem;

import java.time.LocalTime;

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
