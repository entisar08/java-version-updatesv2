package com.cydeo.functionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterface {
    public static void main(String[] args) {

        //Java ready Interfaces
        System.out.println("===================PREDICATE==========================");

        Predicate<Integer> lesserThan= i-> i<18;//this is the implementation of the method
        //you need to call the method name from the predicate interface
        System.out.println(lesserThan.test(20));


        System.out.println("===================CONSUMER==========================");
        Consumer<Integer> display= i-> System.out.println("");
        display.accept(10);

    }
}
