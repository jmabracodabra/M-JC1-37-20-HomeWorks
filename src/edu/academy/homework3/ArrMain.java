package edu.academy.homework3;

import java.util.Arrays;

public class ArrMain {
    public static void main(String[] args) {

        ArrWhile arrWhile = new ArrWhile();
        arrWhile.simpleWhile();

        ArrForeach arrForeach = new ArrForeach();
        arrForeach.forEach();

       ArrEverySecond arrEverySecond = new ArrEverySecond();
       arrEverySecond.everySecond();

        //testing sorting
        Sorting sorting = new Sorting();

        int[] array1 = {0,1,2,3,4,5,6,7,8,9};
        sorting.bubbleSort(array1);
        System.out.println("bubble sort: " + Arrays.toString(array1));

        int[] array2 = {0,1,2,3,4,5,6,7,8,0};
        sorting.bubbleSort(array2);
        System.out.println("bubble sort: " + Arrays.toString(array2));

        int[] array3 = {0,1,2,3,5,5,5,7,8,0};
        sorting.bubbleSort(array3);
        System.out.println("bubble sort: " + Arrays.toString(array3));

        int[] array4 = {1,1,1,1,1,1,1,1,1,0};
        sorting.bubbleSort(array4);
        System.out.println("bubble sort: " + Arrays.toString(array4));

        int[] array11 = {0,1,2,3,4,5,6,7,8,9};
        sorting.selectionSort(array11);
        System.out.println("selection sort: " + Arrays.toString(array11));

        int[] array22 = {0,1,2,3,4,5,6,7,8,0};
        sorting.selectionSort(array22);
        System.out.println("selection sort: " + Arrays.toString(array22));

        int[] array33 = {0,1,2,3,5,5,5,7,8,0};
        sorting.selectionSort(array33);
        System.out.println("selection sort: " + Arrays.toString(array33));

        int[] array44 = {1,1,1,1,1,1,1,1,1,0};
        sorting.selectionSort(array44);
        System.out.println("selection sort: " + Arrays.toString(array44));




    }
}
