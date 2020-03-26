package edu.academy.homework2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10");
        int num = 0;
        int count = 0;

        while (num != 10 && count < 5) {
            num = in.nextInt();
            count++;
        }


    }
}

