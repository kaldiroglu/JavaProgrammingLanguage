package org.javaturk.jp.ch13;

class Book {
    String title;
    String author;
    int pageCount;
    int currentPage;
    boolean borrowed;

    public double read(int pages) {
        currentPage += pages;
        return (double) currentPage / pageCount * 100;
    }

    public void borrow() {
        borrowed = true;
    }

    public void giveBack() {
        borrowed = false;
    }

    public String info() {
        String info = "Book Info: " + title + " by " + author + ". Page " + currentPage
                + " of " + pageCount + (borrowed ? ", borrowed." : ", on the shelf.");
        return info;
    }
}
