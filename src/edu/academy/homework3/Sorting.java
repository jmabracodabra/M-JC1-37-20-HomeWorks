package edu.academy.homework3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public void swap(int[] array, int ind1, int ind2) {
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;

    }

    public void bubbleSort(int[] array) {

        boolean needIt = true;

        while (needIt) {
            needIt = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIt = true;
                }
            }
        }

    }

    public void selectionSort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int min = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[min]) {
                    min = i;
                }
            }
            swap(array, left, min);
        }
    }

}

