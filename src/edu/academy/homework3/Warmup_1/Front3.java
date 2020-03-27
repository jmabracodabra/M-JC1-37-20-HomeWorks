package edu.academy.homework3.Warmup_1;

public class Front3 {
    public String front3(String str) {
        String first;

        if (str.length() >= 3) {
            first = str.substring(0, 3);
        } else {
            first = str;
        }
        return first + first + first;

    }

}
