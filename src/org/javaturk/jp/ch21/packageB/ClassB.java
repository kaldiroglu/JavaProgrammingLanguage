package org.javaturk.jp.ch21.packageB;

//import org.*; // Only imports the classes under the package "org"

import org.javaturk.jp.ch21.packageX.ClassX;
import org.javaturk.jp.ch21.packageX.ClassZ;

public class ClassB {
	ClassX x;
	ClassZ z;
	
	public ClassB(ClassX x) {
		this.x = x;
	}

	public ClassB(ClassX x, ClassZ z) {
		this.x = x;
		this.z = z;
	}
}

class ClassC {
	ClassX x;
	ClassZ z;
}

class ClassD {
	ClassX x;
	ClassZ z;
}
