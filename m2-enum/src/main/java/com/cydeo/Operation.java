package com.cydeo;

public enum Operation {
    DIVIDE, MINUS, MULTIPLY, PLUS; //each constant is object(new) of Operation

    private Operation() {
        System.out.println("Constructor");
    }

}
