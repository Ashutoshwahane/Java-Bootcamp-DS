package com.ashutosh;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
      /*  greeting();
        add();
        int sum_ans = sum1();
        String ans = jobTitle();
        System.out.println("the ans is " + ans);
*/
        int sum = sum2(3,97);
        System.out.println("the sum is : " + sum);
    }

    static void add() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num1 = in.nextInt();
        System.out.println("Enter the number :");
        int num2 = in.nextInt();
        System.out.println("The Sum : " + (num2 + num1));

    }

    // no return
    static void greeting() {
        System.out.println("Hello World! No Return (Void)");
    }

    // return int
    static int sum1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num1 = in.nextInt();
        System.out.print("Enter the number :");
        int num2 = in.nextInt();
        return num1 + num2;
    }

    // return string
    static String jobTitle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your job title : ");
        String jt = in.nextLine();
        return jt;
    }

    // take something return something
    static int sum2(int a, int b) {
        return a + b;
    }
}
