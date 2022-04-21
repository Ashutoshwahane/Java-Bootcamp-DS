package com.ashutosh;

import java.util.Scanner;

public class UgliNumber {

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the a number : ");
        int num = input.nextInt();
        int k = 0;

        if (num <= 0){
            System.out.println("Please enter the correct number : ");
            num = input.nextInt();
        }

        while (num != 1){
            if (num % 2 == 0){
                num = num / 2;
            } else if (num % 3 == 0){
                num = num / 3;
            } else if (num % 5 == 0){
                num = num / 5;
            } else  {
                System.out.println("It is not a ugli Number");
                k = 1;
                break;
            }
        }

        if (k == 0)
        System.out.println("It is a Ugly number");
    }


}
