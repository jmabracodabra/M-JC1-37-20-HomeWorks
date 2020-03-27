package edu.academy.homework3;

import java.util.Scanner;

public class ArrWhile {
    public void simpleWhile() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input an array length");
        int num = in.nextInt();
        int[] numArray = new int[num];

        System.out.println("Input elements of the array:");
        int i = 0;
        while(i < num){
            numArray[i] = in.nextInt();
            i++;
        }

        System.out.println("The array is: ");
        i = 0;
        while (i < num){
            System.out.print(numArray[i] + " ");
            i++;
        }

    }
}
