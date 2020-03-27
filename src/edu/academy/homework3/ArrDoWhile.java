package edu.academy.homework3;

import java.util.Scanner;

public class ArrDoWhile {

    public void doWhile() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input an array length");
        int num = in.nextInt();
        int[] numArray = new int[num];
        int i = 0;

        System.out.println("Input elements of the array:");
        do{
            numArray[i] = in.nextInt();
            i++;
        } while (i < num);

        System.out.println("The array is: ");
        i = 0;
        do{
            System.out.print(numArray[i] + " ");
            i++;
        } while (i <= num - 1);

    }
}
