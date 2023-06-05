package com.test;

import java.io.IOException;

public class Vowel {
    public static void main(String[] args)
            throws IOException
    {
        String str="Hi Gowtham How are You";
        str.toLowerCase();
        int i=0,count=0;
        for (i=0;i<=str.length();i++){
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
            System.out.println("enter"+count);
        }
    }
}
