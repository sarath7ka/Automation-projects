package com.test;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int i, count = 0;

        for (i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
                break;

            }


        }
        if (count == 0 && number != 0) {
            System.out.println(number + "is a prime");
        }
        else {
            System.out.println(number+"not");
        }

    }
}
