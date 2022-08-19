package com.cydeo;

public class Main {

    //how to access enum constant
    public static void main(String[] args) {
        System.out.println("How to access a constant ");
        Currency c= Currency.DIME;//how to create enum object
        //d
        System.out.println(c);//you dont need to do toString method to
        // avoid the hash because the toString method is alreay overriden
        //who did it ?
        System.out.println(Currency.PENNY);

        System.out.println("=====================================================================");
        System.out.println("How to access all constant ");
        // we can use value method that is already in the paternt class of enum
        //the values return a n array of constants you better prepare a bucket with type Currancy
        Currency[] currencies= Currency.values();
        //System.out.println(currencies.toString()); it is array you need to print it through a loop
        for (Currency currency : currencies) {
            System.out.println(currency);

        }

    }
}
