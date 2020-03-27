package edu.academy.homework3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        //multiplication table
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        //factorial
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println(result);

        // multiplication
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int prod = 1;
        while(num1 != 0){
            prod *= (num1 % 10);
            System.out.println("Промежуточное произведение " + prod);
            num1/=10;
            System.out.println(num1);
        }
        System.out.println("Финальный результат " + prod);

    }
}
