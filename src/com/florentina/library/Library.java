package com.florentina.library;

import com.florentina.borrowable.Borrowable;
import com.florentina.people.Person;
import com.florentina.people.Resident;
import com.florentina.people.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Person> registeredPeople;
    private List<Borrowable> borrowableList;


    public Library() {
        this.registeredPeople = new ArrayList<>();
        this.borrowableList = new ArrayList<>();
    }

    public boolean registerPeople(Person person) {
        if (registeredPeople.isEmpty()) {
            registeredPeople.add(person);
            person.setRegistered(true);
            System.out.println("Successfully registered");
            return true;
        }
        if (!isRegistered(person)){
            person.setRegistered(true);
            registeredPeople.add(person);
            System.out.println("Successfully registered!");
            return true;
        }else{
            System.out.println("Cannot register twice!");
            return false;
        }
    }

    public void borrowItems(String productId, Person person) {
        if (((person instanceof Resident && person.canBorrow()) || (person instanceof Student && person.canBorrow())) && person.isRegistered()) {
            for (Borrowable borrowable1 : borrowableList) {
                if (productId.equals(borrowable1.getLibraryId())) {
                    if(borrowable1.isBorrowable()){
                        borrowable1.setBorrowable(false);
                        borrowable1.addReturnationDate();
                        person.getItemsBorrowed().add(borrowable1);
                        System.out.println("Success borrowed");
                    }else{
                        System.out.println("It is taken");
                    }
                }
            }
        }else{
            System.out.println("You exceed the capacity of barrow");
        }
    }


    public List<Person> getRegisteredPeople() {
        return registeredPeople;
    }

    public List<Borrowable> getBorrowableList() {
        return borrowableList;
    }

    public boolean isRegistered(Person person){
        for(Person person1 : registeredPeople){
            if (person.getPersonId().equals(person1.getPersonId())) {
                return true;
            }
        }
        return false;
    }

    public void addItemInLibrary(Borrowable borrowable){
        borrowableList.add(borrowable);
    }


    public void checkIsLate(Person person){
        LocalDate today = LocalDate.now();
        for (Borrowable borrowable: person.getItemsBorrowed()){
            if (borrowable.getReturnationDate().getDayOfMonth() < today.getDayOfMonth()) {
                System.out.println("You are late");
            }
        }
    }





}
