package com.ashutosh;

import java.util.Arrays;

public class Shadowing {
    static int x; // this will be shadow at line 8

    public static void main(String[] args) {
        x = 10;

        int x = 100; // override , the class variable at line 4 is shadowed by this

        VarArgs(12,234,25,123,5,56,234,1,657,234,225,724,1);
        VarArgs("asdf", "qeq", "sfhh","asd");
        System.out.println(isPrime(8));

        // armstrong number are 153, 370, 371, 407
        armstrongNumber(370);

    }

    void sum() {
        x = 100;
    }

    // function overloading parameter are different ( int )
    static void VarArgs(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    // function overloading parameter are different ( String )
    static void VarArgs(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;

    }

    static void armstrongNumber(int a){
        int temp = a;
        int sum = 0;
        while (a > 0 ){
            int rem = a % 10;
            a = a / 10;
            sum = sum + rem * rem * rem;
        }
        if (sum == temp){
            System.out.println("Armstrong Number : " + temp + " : " + sum);
        }else System.out.println("Not armstrong number : "+ temp + " : " + sum);
    }
}
