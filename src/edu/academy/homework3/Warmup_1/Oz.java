package edu.academy.homework3.Warmup_1;

public class Oz {
    public String startOz(String str) {
        if (str.length() < 2) {
            return str;
        }
        String firstChar = str.substring(0, 1);
        String secondChar = str.substring(1, 2);
        String newWord = "";

        if (firstChar.equals("o")) {
            newWord = newWord.concat(firstChar);
        }
        if (secondChar.equals("z")) {
            newWord = newWord.concat(secondChar);
        }
        return newWord;
    }
}
