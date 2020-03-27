package edu.academy.homework3.Warmup_1;

import java.util.Scanner;

public class MissingChar {
    public String missingChar(String str, int n) {

        String newWord;
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.deleteCharAt(n);
        newWord = stringBuffer.toString();
        return newWord;
    }
}

