package com.florentina.borrowable;

public class Cd extends Borrowable{
    private int numberOfTracks;


    public Cd(String name, int numberOfTracks) {
        super(name);
        this.numberOfTracks = numberOfTracks;
    }


    public int getNumberOfTracks() {
        return numberOfTracks;
    }
}
