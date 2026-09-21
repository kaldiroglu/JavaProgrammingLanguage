package org.javaturk.jp.ch23.classAccess;

import org.javaturk.jp.ch23.classAccess.x.*;

public class ClassA {
	ClassB b = new ClassB();
	ClassXX x = new ClassXX();

//		Not visible! Package accessible!
 		// ClassZZ z;

}
