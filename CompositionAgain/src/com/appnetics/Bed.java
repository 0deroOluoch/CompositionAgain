package com.appnetics;

public class Bed {
    private String name;
    private String size;

    public Bed(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public void guestsComingforASleepOver(){
        System.out.println("bed too small");
    }
    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }
}
