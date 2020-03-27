package edu.academy.homework3.Warmup_1;

public class DelDEL {
    public String delDel(String str) {
        if(str.length() < 4){
            return str;
        }
        String del = str.substring(1,4);

        if(del.equals("del")){
            return str.replace(del,"");
        }
        return str;
    }

}
