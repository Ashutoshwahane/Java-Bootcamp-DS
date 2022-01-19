package com.ashutosh;

public class Scope {
    public static void main(String[] args) {
        int a = 20;
        int b = 90;

        {
            // block scope
            a = 100;
            int c = 99;
            // value initialize in this block , will remain in this block
        }


    }

    static void random(){
        int num = 110; // function scope

    }
}
