package edu.academy.homework3.Warmup_1;

public class Diff21 {
    public int diff21(int n) {
        int diff = Math.abs(n - 21);
        if (n > 21) {
            return diff * 2;
        }
        return diff;
    }

}
