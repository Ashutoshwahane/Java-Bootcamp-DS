package com.ashutosh;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Temperature in C : ");
        float c = input.nextInt();
        float f = (c * 9/5) + 32;
        System.out.println("Temperature in F is : "+f);
    }
}
