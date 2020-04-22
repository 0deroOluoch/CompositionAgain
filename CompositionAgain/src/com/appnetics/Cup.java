package com.appnetics;

public class Cup {
    private String name;
    private String size;

    public Cup(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public void canIHaveCoffee(){
        System.out.println("Cup is too big");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }
}
