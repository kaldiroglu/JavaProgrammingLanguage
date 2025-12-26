package org.javaturk.jp.ch02.selam;

public class SelamTest {

	public static void main(String[] args) {
		Selam nesne = new Selam();
		String cevap = nesne.selamSöyle("Ali");
		System.out.println(cevap);

        cevap = nesne.selamSöyle("Yeliz");
        System.out.println(cevap);
	}
}
