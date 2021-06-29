package com.florentina.people;

import com.florentina.borrowable.Borrowable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Person {
    private boolean isRegistered ;
    private UUID personId;
    protected List<Borrowable> itemsBorrowed;

    public Person() {
        this.isRegistered = false;
        personId = UUID.randomUUID();
        this.itemsBorrowed = new ArrayList<>();
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }


    public UUID getPersonId() {
        return personId;
    }

    public List<Borrowable> getItemsBorrowed() {
        return itemsBorrowed;
    }

    public abstract boolean canBorrow();


}
