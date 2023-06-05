package com.test;

public class Swap {
    public static void main(String[] args) {
        int x = 8;
        int y = 5;

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping");
        System.out.println(x = x);
        System.out.println(y = y);
    }
}
