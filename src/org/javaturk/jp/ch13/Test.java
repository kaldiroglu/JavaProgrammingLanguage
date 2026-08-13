package org.javaturk.jp.ch13;

public class Test {

	public static void main(String[] args) {
		Book book1 = new Book();

		System.out.println("An object right after it is created.");
		System.out.println(book1.info());

		System.out.println("\nAfter its state is set.");
		book1.title = "Effective Java";
		book1.author = "Joshua Bloch";
		book1.pageCount = 416;
		book1.currentPage = 0;
		System.out.println(book1.info());

		System.out.println("\nWhile it is being read.");
		book1.read(40);
		book1.read(60);
		System.out.println(book1.info());

		System.out.println();

		Book book2 = new Book();
		book2.title = "Clean Code";
		book2.author = "Robert C. Martin";
		book2.pageCount = 464;
		book2.currentPage = 100;
		System.out.println(book2.info());

		book2.borrow();
		double completed = book2.read(132);
		System.out.println("Completed " + completed + " percent of the book.");
		System.out.println(book2.info());

		book2.giveBack();
		System.out.println(book2.info());
	}
}
