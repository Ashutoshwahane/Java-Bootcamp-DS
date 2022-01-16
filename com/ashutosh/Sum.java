package com.ashutosh;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int first_number = input.nextInt();
        System.out.print("Enter the second number : ");
        int second_number = input.nextInt();
        int sum = first_number + second_number;
        System.out.println("Sum is " + sum);
    }
}
