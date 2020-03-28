package edu.academy.homework4;

import java.util.Comparator;

public class CountryAreaComparator implements Comparator<ECountry> {
    public int compare(ECountry country1, ECountry country2) {
        if (country1.getArea() == country2.getArea()) {
            return 0;
        }
        if (country1.getArea() > country2.getArea()) {
            return 1;
        }
        return -1;
    }
    
}
