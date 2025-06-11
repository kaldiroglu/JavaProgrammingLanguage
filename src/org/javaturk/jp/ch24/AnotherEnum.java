package org.javaturk.jp.ch24;

public enum AnotherEnum {
	
	CONSTANT;
	int i;
	static String s;

	{
		i = 7;
		System.out.println("in instance init block.");
	}

	static
	{
		s = "Naber?";
		System.out.println("in static init block.");
	}
	
	public static void main(String[] args) {
		System.out.println("Selam");
//		CONSTANT.i = 10;
		System.out.println(CONSTANT.i);
//		s = "enummm :)";
		System.out.println(s);
	}

}

//enum X extends AnotherEnum{
//
//}
