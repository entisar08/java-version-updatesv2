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

    }

}
