package com.ashutosh;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        // Q: Print the number from 1 to 10
        /*System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);*/ // .....

        // for(initialization; condition; increment/decrement)

       /* for (int num = 1; num<=5; num += 1){
            System.out.println(num);
        }*/

        // print number from 1 to n
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = input.nextInt();
        /*for (int num = 1; num <=number; num += 1){
            System.out.println(num);
        }*/

        int num = 1;

        // when you don't know how many time loop is going to number
        /*while (num<=number){
            System.out.print(num + " ");
            num += 1;
        }*/

        // when you the loop at least for the first time
        do {
            System.out.print(num + " ");
            num += 1;
        }while (num<=number);
    }
}
