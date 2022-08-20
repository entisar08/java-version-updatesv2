package com.cydeo.TaskLambda.OrangeTask;

import com.cydeo.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory =new ArrayList<>();
        inventory.add(new Orange(Color.GREEN,300));
        inventory.add(new Orange(Color.RED,100));
        inventory.add(new Orange(Color.GREEN,200));
        inventory.add(new Orange(Color.RED,50));

        OrangeFormatter orangeaWeight= orange -> "An orange of "+orange.getWeight() + "g";
        prettyPrintOrange(inventory,orangeaWeight);

        OrangeFormatter orangeColor= orange ->{
            String ch=orange.getWeight()> 200 ? "Heavy":"Light"  ;
            return "A "+ch +" "+ orange.getColor() +"orange";
        };




    }


    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter formatter){

        for (Orange orange : inventory) {
            String output= formatter.accept(orange);
            System.out.println(output);


        }
    }
}
