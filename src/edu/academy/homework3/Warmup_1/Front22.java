package edu.academy.homework3.Warmup_1;

public class Front22 {
    public String front22(String str) {
        String firstTwo;
        if(str.length() >= 2){
            firstTwo = str.substring(0,2);
        } else{
            firstTwo = str.substring(0,str.length());
        }
        return firstTwo + str + firstTwo;
    }

}
