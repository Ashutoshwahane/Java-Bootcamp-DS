package com.ashutosh;

import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
        // primitive data type /** the last  data-type which cannot be break further*/
        int roll_no = 100;  // 4 bytes
        char first_letter_name = 'A';
        float marks = 99.99f;  // 4 bytes
        double largeDecimalNumber = 99999.39393;  // 8 bytes
        long largeIntegerNumber = 123214135245L;  // 8 bytes
        boolean check = false; // true

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter : ");
//        roll_no = input.nextInt();
//        int million = 1000_000_00;  // -> 100000000
//        String name = input.nextLine();
        marks = input.nextFloat();
        System.out.println(marks);

    }
}
