package edu.academy.homework3.Warmup_1;

public class BackAround {

    public String backAround(String str) {
        int stringLength = str.length();
        char lastChar = str.charAt(stringLength - 1);

        StringBuilder sb = new StringBuilder();
        sb.append(lastChar);
        sb.append(str);
        sb.append(lastChar);

        return sb.toString();

    }

}
