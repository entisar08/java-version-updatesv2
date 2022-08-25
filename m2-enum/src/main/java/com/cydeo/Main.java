package com.cydeo;

public class Main {

    //how to access enum constant
    public static void main(String[] args) {
        System.out.println("How to access a constant ");
        Currency c = Currency.DIME;//how to create enum object
        //d
        System.out.println(c);//you dont need to do toString method to
        // avoid the hash because the toString method is alreay overriden
        //who did it ?
        System.out.println(Currency.PENNY);

        System.out.println("=====================================================================");
        System.out.println("How to access all constant ");
        // we can use value method that is already in the paternt class of enum
        //the values return a n array of constants you better prepare a bucket with type Currancy
        Currency[] currencies = Currency.values();
        //System.out.println(currencies.toString()); it is array you need to print it through a loop
        for (Currency currency : currencies) {
            System.out.println(currency);


            System.out.println("=====================================================================");

            Currency myCurrency = Currency.QUARTER;
            switch (myCurrency) {
                case PENNY:
                    System.out.println("It is 1 cent");
                    break;
                case NICKLE:
                    System.out.println("It is 5 cent");
                    break;
                case DIME:
                    System.out.println("It is 10 cent");
                    break;
                case QUARTER:
                    System.out.println("It is 25 cent");
                    break;
            }

            System.out.println("Operation Task");
            calculate(3, 5, Operation.PLUS);


            System.out.println("How top retrieve the constant value");
            System.out.println(Currency.PENNY.getValue());
            System.out.println(Currency.QUARTER.getValue());
            System.out.println(Currency.QUARTER.ordinal());


        }


    }

    private static void calculate(double x, double y, Operation operation) {

        switch (operation) {
            case PLUS:
                System.out.println(x + y);
                break;
            case MINUS:
                System.out.println(x - y);
                break;
            case MULTIPLY:
                System.out.println(x * y);
                break;
            case DIVIDE:
                System.out.println(x / y);
                break;
        }


    }


}


