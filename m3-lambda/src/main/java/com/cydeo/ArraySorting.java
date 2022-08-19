package com.cydeo;

public class ArraySorting {
    public static void main(String[] args) {
        //methos to sort array: quick sort ,bubbleSort
        ArraySorting as = new ArraySorting();
        
        //as.sort();

        QuickSort qs=new QuickSort();
        BubbleSort bs =new BubbleSort();

            as.sort(qs);
            as.sort(bs);
            qs.sort();




        
    }


   private void sort(Sorting sorting) {

        sorting.sort();
        //this will be excuted based on quick sort or bubble sort
    }
}
