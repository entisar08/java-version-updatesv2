package com.cydeo.functionalInterfaces;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {

        //Java ready Interfaces
        System.out.println("===================PREDICATE==========================");

        Predicate<Integer> lesserThan= i-> i<18;//this is the implementation of the method
        //you need to call the method name from the predicate interface
        System.out.println(lesserThan.test(20));


        System.out.println("===================CONSUMER==========================");
        Consumer<Integer> display= i-> System.out.println("i");
        display.accept(10);

        System.out.println("===================BI CONSUMER==========================");
        BiConsumer<Integer,Integer> addTwo=(x,y)->System.out.println(x+y) ;
        addTwo.accept(1,2);

        System.out.println("===================FUNCTION==========================");
        Function<String,String> fun = s-> "Hello" + s;
        System.out.println(fun.apply("Cydeo"));

        System.out.println("===================BI FUNCTION==========================");

        BiFunction<Integer,Integer,Integer> func= (x1,x2)->x1+x2;
        System.out.println(func.apply(2,3));

        System.out.println("===================Supplier==========================");
        Supplier<Double> randomValue=()-> Math.random();

        randomValue.get();




    }
}
