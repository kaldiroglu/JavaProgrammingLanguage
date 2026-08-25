package org.javaturk.jp.ch21.packageA;

class ClassA {

//	ClassX x1; // Error!
	org.javaturk.jp.ch21.packageX.ClassX x;
	
	public ClassA(org.javaturk.jp.ch21.packageX.ClassX x) {
		this.x = x;
	}
}

class ClassB {
	org.javaturk.jp.ch21.packageX.ClassX x;

	void setX(org.javaturk.jp.ch21.packageX.ClassX x){
		this.x = x;
	}
}
