package edu.academy.homework3.Warmup_1;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if ((hour < 7 || hour > 20) && talking) {
            return true;
        }
        return false;
    }
}
