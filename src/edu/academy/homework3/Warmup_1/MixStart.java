package edu.academy.homework3.Warmup_1;

import java.util.Scanner;

public class MixStart {
    public boolean mixStart(String str) {

        if (str.length() < 3) {
            return false;
        }
        String secondThird = str.substring(1, 3);

        if (secondThird.equals("ix")) {
            return true;
        } else return false;
    }
}
