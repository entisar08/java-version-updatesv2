package com.cydeo;

public abstract class Player {//so no one create an iobject of this class
    private String name;

    public String getName() {

        return name;
    }

    public Player(String name) {

        this.name = name;
    }
}
