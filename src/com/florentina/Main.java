package com.florentina;

import com.florentina.borrowable.Book;
import com.florentina.borrowable.Borrowable;
import com.florentina.borrowable.Cd;
import com.florentina.library.Library;
import com.florentina.people.Person;
import com.florentina.people.Resident;
import com.florentina.people.Student;

public class Main {

    public static void main(String[] args) {



        Library ourFamousLibrary = new Library();
        Borrowable cd1 = new Cd("Angelica Milea", 23);
        Borrowable cd2 = new Cd("Coco Jambo", 56);
        Borrowable cd3 = new Cd("Surpriza Manole", 3);
        Borrowable cd4 = new Cd("Neica Nunu", 2);
        Borrowable cd5 = new Cd("Susnea Mirela", 93);
        Borrowable cd6 = new Cd("Ghita Dragos", 73);

        Borrowable book1 = new Book("Ciocoii Noi", 456);
        Borrowable book2 = new Book("Pe dealuri", 234);
        Borrowable book3 = new Book("Pe Coline", 123);
        Borrowable book4 = new Book("Surprise", 231);
        Borrowable book5 = new Book("Semana Noua", 567);


        Person simina = new Student();
        Person flori = new Resident();
        Person silviu = new Resident();
        Person bogdan = new Student();

        ourFamousLibrary.registerPeople(simina);
        ourFamousLibrary.registerPeople(flori);
        ourFamousLibrary.registerPeople(silviu);
        ourFamousLibrary.registerPeople(bogdan);
        ourFamousLibrary.registerPeople(bogdan);


        ourFamousLibrary.addItemInLibrary(cd1);
        ourFamousLibrary.addItemInLibrary(cd2);
        ourFamousLibrary.addItemInLibrary(cd3);
        ourFamousLibrary.addItemInLibrary(cd4);
        ourFamousLibrary.addItemInLibrary(cd5);
        ourFamousLibrary.addItemInLibrary(cd6);

        ourFamousLibrary.addItemInLibrary(book1);
        ourFamousLibrary.addItemInLibrary(book2);
        ourFamousLibrary.addItemInLibrary(book3);
        ourFamousLibrary.addItemInLibrary(book4);
        ourFamousLibrary.addItemInLibrary(book5);


        String uuid = cd1.getLibraryId();

        ourFamousLibrary.borrowItems(uuid, simina);
        ourFamousLibrary.borrowItems(uuid, silviu);
        ourFamousLibrary.checkIsLate(simina);



        System.out.println(ourFamousLibrary.getBorrowableList());






    }
}
