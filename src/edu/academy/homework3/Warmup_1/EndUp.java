package edu.academy.homework3.Warmup_1;

public class EndUp {

    public String endUp(String str) {
        String newLine;
        if (str.length() < 3) {
            newLine = str.toUpperCase();
        } else {
            String lastThree = str.substring(str.length() - 3).toUpperCase();
            String firstChars = str.substring(0, str.length() - 3);
            newLine = firstChars.concat(lastThree);
        }
        return newLine;
    }
}
