package org.javaturk.jp.ch02;

public class Selam{
	String world = "everyone";

	public String greet(String whom) {
		String sentence;
		if (whom != "")
			sentence = "Selam " + whom + " :)";
		else
			sentence = "Selam " + world + " :)";
		return sentence;
  }
}
