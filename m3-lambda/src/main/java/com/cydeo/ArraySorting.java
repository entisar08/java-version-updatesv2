package com.cydeo;

public class ArraySorting {
    public static void main(String[] args) {
        //methos to sort array: quick sort ,bubbleSort
        ArraySorting as = new ArraySorting();
          //as.sort(); this is a method in the class
        QuickSort qs=new QuickSort();
        BubbleSort bs =new BubbleSort();
       as.sort(qs);
       as.sort(bs);
            //qs.sort();
        Sorting quickSorting = ()-> System.out.println("quick Sorting ");
    }
   private void sort(Sorting sorting) {//this is by creatin interface sorting,then create an implementation onthis
        // interface and override the method in the interface
       //then create an object of these classes

       // in the main class create a custom method that take the functional classes object as parameter
       //but when the object pass through the method it will call the class method sort that was implemented in its class

        sorting.sort();
        //
        //this will be excuted based on quick sort or bubble sort
    }

    private void sort() {

        System.out.println("Array sorting object can call this method");
    }


}
