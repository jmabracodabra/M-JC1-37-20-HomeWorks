package edu.academy.homework3.Warmup_1;

public class FrontBack {

    public String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        }
        String newStr = str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
        return newStr;
    }
}
