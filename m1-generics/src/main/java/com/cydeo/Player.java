package com.cydeo;

public abstract class Player {//so no one create an iobject of this class
    public Player(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
