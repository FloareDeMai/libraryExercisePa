package com.florentina.people;

public class Student extends Person {

    private final int maxItems = 3;


    @Override
    public boolean canBorrow() {
        return itemsBorrowed.size() < maxItems;
    }
}
