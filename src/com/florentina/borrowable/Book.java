package com.florentina.borrowable;

public class Book extends Borrowable{
    private int numberOfPages;

    public Book(String name, int numberOfPages) {
        super(name);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
