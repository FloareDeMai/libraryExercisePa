package com.florentina.borrowable;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public abstract class Borrowable {
    private String name;
    private UUID libraryId;
    private boolean isBorrowable;
    private LocalDate returnationDate = LocalDate.now();

    public Borrowable(String name) {
        this.name = name;
        this.libraryId = UUID.randomUUID();
        this.isBorrowable = true;
    }

    public String getName() {
        return name;
    }

    public String getLibraryId() {
        return libraryId.toString();
    }

    public boolean isBorrowable() {
        return isBorrowable;
    }

    public void setBorrowable(boolean borrowable) {
        isBorrowable = borrowable;
    }

    public void addReturnationDate(){
        returnationDate = returnationDate.plusDays(3);
    }

    public LocalDate getReturnationDate() {
        return returnationDate;
    }

    @Override
    public String toString() {
        return "Borrowable{" +
                "name='" + name + '\'' +
                ", libraryId=" + libraryId +
                ", isBorrowable=" + isBorrowable +
                '}';
    }
}
