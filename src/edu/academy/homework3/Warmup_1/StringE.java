package edu.academy.homework3.Warmup_1;

public class StringE {
    public boolean stringE(String str) {
        int i;
        int count = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        if (count >= 1 && count <= 3) {
            return true;
        }
        return false;
    }
}
