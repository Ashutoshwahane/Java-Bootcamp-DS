package com.ashutosh;

import java.util.Scanner;



class CoutOccuring {
    public static void main(String[] args) {

        int no = 5;
        int temp = 0;
        for (int i = 1; i <= no; i++) {
            if (i % 3 == 0){
                System.out.println("Bad no");
                temp++;
                i++;
            }else {
                temp = i;
            }
        }

        System.out.println(temp+"");



    }
}

