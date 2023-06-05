package com.test;

public class Fibnoci {
    public static void main(String[] args) {
        int x=0,y=1,z =1,i,count =7;


        for (i=1;i<count;i++){

            z=x+y;
            x=y;
            y=z;

        }
        System.out.println(z);



    }



}
