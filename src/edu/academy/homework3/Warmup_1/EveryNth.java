package edu.academy.homework3.Warmup_1;

public class EveryNth {
    public String everyNth(String str, int n) {
        int i;
        String newStr = "";
        for (i = 0; i < str.length(); i++) {
            if (i % n == 0) {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

}
