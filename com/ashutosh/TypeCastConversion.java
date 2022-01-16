package com.ashutosh;

import java.util.Scanner;

public class TypeCastConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = (int) 99.99f; // type casting
        System.out.println(num);

        // automatic type promotion in expression
        int a = 257;
        byte b = (byte) a; // 257 % 256 = 1
        System.out.println(b);

        byte num1 = 100;
        byte num2 = 50;
        int num3 = num1 * num2;
        System.out.println(num3);


        int number = 'A';
        System.out.println("नमस्कार"); // java supports unicode values extension of ASCII

        // type promotion
        byte n1 = 10;
        float n2 = 12.12f;
        short n3 = 1231;
        char n4 = 'A';
        int n5 = 100;
        double n6 = 12312.245;
        double result = (n1 + n2) * (n3 / n4) * (n5 - n6); // 22.119999 18 -12212.245
        System.out.println((n1 + n2) + " " + (n3 / n4) + " " + (n5 - n6)); // 22.119999 18 -12212.245
        System.out.println(result);


    }
}
