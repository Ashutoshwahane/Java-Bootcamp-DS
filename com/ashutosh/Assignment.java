package com.ashutosh;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter 3 number with space : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Q: Find the largest of the 3 numbers
        /*int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.println("Max : " + max);*/

        // one more methods
   /*     int max = 0;
        if (a>b){
            max = a;
        }else {
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.println("Max : "+ max);
        */

        int max = Math.max(c, Math.max(a, b));
        System.out.println("Max : "+ max);

    }
}
