package com.appnetics;

public class Chair {
    private int howManySeaters;
    private String name;

    public Chair(int howManySeaters, String name) {
        this.howManySeaters = howManySeaters;
        this.name = name;
    }

    public int getHowManySeaters() {
        return howManySeaters;
    }

    public String getName() {
        return name;
    }
}
