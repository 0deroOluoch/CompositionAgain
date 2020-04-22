package com.appnetics;

public class Room {
    private Cup theCup;
    private Bed theBed;
    private StudyTable theStudyTable;
    private Chair theChair;

    public Room(Cup theCup, Bed theBed, StudyTable theStudyTable, Chair theChair) {
        this.theCup = theCup;
        this.theBed = theBed;
        this.theStudyTable = theStudyTable;
        this.theChair = theChair;
    }
}
