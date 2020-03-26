package edu.academy.homework2;

import java.util.Scanner;

public class ColorMain {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 7");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Color color = new Color(num);
        System.out.println("Название цвета " + color.getName() + ", номер цвета " + color.getNumber());
    }
}
