package org.javaturk.jp.ch18;

class SystemDemo {

	public static void main(String[] args) {
		System.out.println("System.out.println");
		System.err.println("System.err.println");

		System.out.println("User home dir: " + System.getProperty("user.home"));
		System.out.println("User working dir: " + System.getProperty("user.dir"));
		System.out.println("Java version: " + System.getProperty("java.version"));
		System.out.println("Line separator: " + System.lineSeparator()); 
		System.out.println("Path separator: " + System.getProperty("path.separator")); 

		long start = System.currentTimeMillis();
		long sum = 0;
		for (long i = 0; i < 1_000_000_000L; i++) {
			sum += i;
		}
		long end = System.currentTimeMillis();
		System.out.println("Time: " + (end - start) + " ms.");
		
		System.exit(1);
	}
}
