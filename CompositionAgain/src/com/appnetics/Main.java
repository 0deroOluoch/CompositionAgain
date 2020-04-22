package com.appnetics;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("22OB2","DELL","240V",dimensions);

	    Monitor theMonitor = new Monitor("27 inch Beast","Acer",27,new Resolution(2540,1440));

	    MotherBoard theMotherBoard = new MotherBoard("BJ-200","Asus",4,6,"V2.44");

	    PC thePc = new PC(theCase,theMonitor,theMotherBoard);
	    thePc.powerUp();

	    Cup theCup = new Cup("ile Kubwa","2litres");
	    Bed theBed = new Bed("small bed","three and a half");
	    Chair theChair = new Chair(35,"Full set");
	    StudyTable theStudyTable = new StudyTable("Office Table",45,15,30);


	    Room bedsitter= new Room(theCup,theBed,theStudyTable,theChair);
	    theCup.canIHaveCoffee();

    }
}
