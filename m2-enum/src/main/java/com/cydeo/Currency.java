package com.cydeo;

public enum Currency {


//PENNYYYY IS AN OBJECT CURRENCY CLASS
    // PENNY IS STATIC SO IT WILL BE ACCESSED THROUGH THE CLASS NAME

    PENNY(1),NICKLE(5),DIME(10),QUARTER(25);

    private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }



}
