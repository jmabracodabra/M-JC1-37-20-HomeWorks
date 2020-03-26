package edu.academy.homework1;

public class BitwiseOperators {
    public static void main(String[] args){
        int x = 42; //00101010
        int y = 15; //00001111

//        // 00101010 & 00001111 = 00001010
//        System.out.println(Integer.toBinaryString(x & y));
//
//        // 00101010 | 00001111 = 00101111
//        System.out.println(Integer.toBinaryString(x | y));
//
//        // 00101010 ^ 00001111 = 00100101
//        System.out.println(Integer.toBinaryString(x ^ y));
//
//        // ~ 00101010 = 11010101
//        System.out.println(Integer.toBinaryString(~x));
//
//        // ~ 00001111 = 11110000
//        System.out.println(Integer.toBinaryString(~y));
//
//        // 00101010 << 00001111 = 101010000000000000000
//        System.out.println(Integer.toBinaryString(x << y));
//
//        // 00101010 >> 00001111 = 0
//        System.out.println(Integer.toBinaryString(x >> y));
//
//        // 00101010 >>> 00001111 = 0
//        System.out.println(Integer.toBinaryString(x >>> y));

        x = -42; //11111111111111111111111111010110
        y = -15; //11111111111111111111111111110001

        // 11111111111111111111111111010110 & 11111111111111111111111111110001 = 11111111111111111111111111010000
        System.out.println(Integer.toBinaryString(x & y));

        // 11111111111111111111111111010110 | 11111111111111111111111111110001 = 11111111111111111111111111110111
        System.out.println(Integer.toBinaryString(x | y));

        // 11111111111111111111111111010110 ^ 11111111111111111111111111110001 = 00100111
        System.out.println(Integer.toBinaryString(x ^ y));

        // ~ 11111111111111111111111111010110 = 00101001
        System.out.println(Integer.toBinaryString(~x));

        // ~ 11111111111111111111111111110001 = 00001110
        System.out.println(Integer.toBinaryString(~y));

        // 11111111111111111111111111010110 << 11111111111111111111111111110001 = 11111111101011000000000000000000
        System.out.println(Integer.toBinaryString(x << y));

        // 11111111111111111111111111010110 >> 11111111111111111111111111110001 = 11111111111111111111111111111111
        System.out.println(Integer.toBinaryString(x >> y));

        // 11111111111111111111111111010110 >>> 11111111111111111111111111110001 = 111111111111111
        System.out.println(Integer.toBinaryString(x >>> y));

    }
}
