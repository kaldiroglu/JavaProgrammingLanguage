package org.javaturk.jp.ch18;

class PovertyOfNewbieJavaDeveloper {
	static int i = 5;

	public static void main(String[] args) {
//		PovertyOfNewbieJavaDeveloper nesne1 = new PovertyOfNewbieJavaDeveloper();
//		System.out.println(nesne1.i);
//		nesne1.i = 100;
//		System.out.println(nesne1.i);
//
//		PovertyOfNewbieJavaDeveloper nesne2 = new PovertyOfNewbieJavaDeveloper();
//		nesne2.i = 400;
//		System.out.println(nesne2.i);

		System.out.println(i);
		f();
	}

	static void f(){
		System.out.println("Naber abi?");
		g();
	}

	 static void g(){
		System.out.println("İyilik Akın abi, senden naber?");
	}
}

