package edu.academy.homework3.Warmup_1;

import java.util.Scanner;

public class Close10 {

    public int close10(int a, int b) {
        int a1 = Math.abs(a - 10);
        int b1 = Math.abs(b - 10);

        if (a1 == b1) {
            return 0;
        }
        if (a1 < b1) {
            return a;
        }
        return b;
    }

}
