package edu.academy.homework3;

import java.util.Scanner;

public class ArrEverySecond {
    public void everySecond() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input an array length");
        int num = in.nextInt();
        int[] numArray = new int[num];

        System.out.println("Input elements of the array:");
        for (int i = 0; i < num; i++) {
            numArray[i] = in.nextInt();
        }

        System.out.println("The array is: ");
        for (int i = 0; i < num; i += 2) {
            System.out.print(numArray[i] + " ");
        }

    }
}
