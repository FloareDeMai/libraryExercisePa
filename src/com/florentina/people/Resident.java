package com.florentina.people;

public class Resident extends Person {
    private final int maxItems = 5;

    @Override
    public boolean canBorrow() {
        return itemsBorrowed.size() < maxItems;
    }
}
