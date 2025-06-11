package org.javaturk.ioop.ch20.problem;

import java.time.LocalTime;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      Problem of this approach is duplicating initialization code into
 *      constructors and can't solve it by calling this().
 */
public class InitializationProblem2 {
	int ratio;

	double coefficient;

	InitializationProblem2() {
		ratio = getRatioFromFile();;
		LocalTime now = LocalTime.now();
		if (now.isBefore(LocalTime.MIDNIGHT))
			coefficient = 2 * (ratio + 1);
		else
			coefficient = 4 * (ratio - 1);
		// Using this() doesn't work gere
//		this(ratio);
	}

	InitializationProblem2(int ratio) {
		this.ratio = ratio;
		LocalTime now = LocalTime.now();
		if (now.isBefore(LocalTime.NOON))
			coefficient = 2 * ratio;
		else
			coefficient = 4 * ratio;
	}

	private int getRatioFromFile() {
		return 2;
	}

	private String getNameFromFile() {
		return "Default";
	}
}
