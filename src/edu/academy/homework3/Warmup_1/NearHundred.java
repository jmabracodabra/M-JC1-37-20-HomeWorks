package edu.academy.homework3.Warmup_1;

public class NearHundred {
    /*
    public boolean nearHundred(int n) {
        if ((n >= 90 && n <= 110) || (n <= 210 && n >= 190)){
            return true;
        }
        return false;
    }
}
*/

    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }
}