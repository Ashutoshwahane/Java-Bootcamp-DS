package com.ashutosh;

public class Swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 90;

       // swap(a,b);

        // change value of primitive data type or original variable value ( object )

        reverseString("ashutosh");
    }

    static void reverseString(String name){
        char ch;
        String reverseObj = "";
        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            reverseObj = ch + reverseObj;
        }
        System.out.println("reverse string is : "+reverseObj);
    }

    static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}
