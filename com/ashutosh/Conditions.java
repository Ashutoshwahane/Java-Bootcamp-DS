package com.ashutosh;

public class Conditions {

    public static void main(String[] args) {
	// write your code here
        /*
        *  Syntax of if statements:
        *  if (boolean expression T or F){
        *      body
        *  } else{
        *    do something
        * }
        * */

        int salary = 1000;
        if (salary < 1000){
            System.out.println("Manager");
        } else if (salary == 10000){
            System.out.println("Mid Manager");
        } else{
            System.out.println("junior managaer");
        }
    }
}
