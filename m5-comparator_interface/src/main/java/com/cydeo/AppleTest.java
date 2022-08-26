package com.cydeo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {
    public static void main(String[] args) {


        //let us create inventory

        List<Apple> inventory =new ArrayList<>();
        inventory.add(new Apple(Color.GREEN,300));
        inventory.add(new Apple(Color.RED,100));
        inventory.add(new Apple(Color.GREEN,200));
        inventory.add(new Apple(Color.RED,50));


        Comparator<Apple> sortApple= comparing(apple-> apple.getWeight());
        inventory.sort(sortApple);
        System.out.println(inventory);
        inventory.sort(comparing(Apple::getWeight));
//Reversed
        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        //Chaining
        inventory
                .sort(comparing(Apple::getWeight)
                        .reversed().thenComparing(Apple::getColor));





    }

}
