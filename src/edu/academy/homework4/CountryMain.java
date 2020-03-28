package edu.academy.homework4;

import java.util.Scanner;

public class CountryMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the name of the first country");
        String country1 = in.nextLine();
        System.out.println("Please, enter the name of the second country");
        String country2 = in.nextLine();

        ICountry belarus = ECountry.valueOfIgnoreCase(country1);
        if (belarus == ECountry.BELARUS) {
            System.out.println("гэта Беларусь, дзетка");
        }

        CountryAreaComparator comparator = new CountryAreaComparator();
        int resultOfCompare = comparator.compare(ECountry.valueOfIgnoreCase(country1), ECountry.valueOfIgnoreCase(country2));

        if (resultOfCompare == 0) {
            System.out.println("The area of " + country1 + " is equal to the area of " + country2);
        }
        if (resultOfCompare == 1) {
            System.out.println("The area of " + country1 + " is bigger than the area of " + country2);
        }
        if (resultOfCompare == -1) {
            System.out.println("The area of " + country1 + " is smaller than the area of " + country2);
        }
    }
}
