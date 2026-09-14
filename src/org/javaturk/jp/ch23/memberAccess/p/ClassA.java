package org.javaturk.jp.ch23.memberAccess.p;

public class ClassA {
	public static void main(String[] args) {
		ClassP p = new ClassP();
		
		System.out.println(p.x);
		System.out.println(p.y);
		System.out.println(p.w);
//		System.out.println(p.z);
		
		p.publicMethod();
		p.defaultMethod();
		p.protectedMethod();
//		p.privateMethod();
	}
}
