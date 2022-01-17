package com.ashutosh;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        System.out.print(" character : " + ch);
        if (ch >= 'a' && ch <= 'z'){
            System.out.print(" Small Case");
        }else{
            System.out.print(" Upper Case");
        }
    }
}
