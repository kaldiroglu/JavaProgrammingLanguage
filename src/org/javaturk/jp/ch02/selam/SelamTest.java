package org.javaturk.jp.ch02.selam;

public class SelamTest {

	public static void main(String[] args) {
		Selam nesne1 = new Selam();
		String answer = nesne1.selamSöyle("Ayşe");
		System.out.println(answer);

        Selam nesne2 = new Selam();
        answer = nesne2.selamSöyle("Sinan");
        System.out.println(answer);
	}
}
