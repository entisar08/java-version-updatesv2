package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {


        //let us create inventory

        List<Apple> inventory =new ArrayList<>();
        inventory.add(new Apple(Color.GREEN,300));
        inventory.add(new Apple(Color.RED,100));
        inventory.add(new Apple(Color.GREEN,200));
        inventory.add(new Apple(Color.RED,50));
//now we need to call the method and pass two objects of different implementation
        List<Apple> heavyApple=filterApples(inventory, new AppleHeavyPredicate());
        System.out.println(heavyApple);
        List<Apple> greenApple=filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple);
        ApplePredicate weightApple = apple -> apple.getWeight()>200;
        filterApples(inventory,weightApple);


    }
//now create method to accept the two behaviors
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){
        List <Apple> result= new ArrayList<>();
        for (Apple apple : inventory) {
            if (applePredicate.test(apple)){
                result.add(apple);
            }

        }
        return result;
    }

}
