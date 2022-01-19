package com.ashutosh;

public class Swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 90;

        swap(a,b);

        // change value of primitive data type or original variable value ( object )
    }

    static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}
