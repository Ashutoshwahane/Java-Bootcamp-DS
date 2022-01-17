package com.ashutosh;

public class Palimdrome {
    public static void main(String[] args) {
        int n = 1234;
        int final_number = 0;
        while (n>0){
            int rem = n % 10;
            final_number = final_number * 10 + rem;
            n /= 10;
        }
        System.out.println(final_number);


    }
}
