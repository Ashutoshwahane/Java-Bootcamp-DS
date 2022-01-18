package com.ashutosh;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

 /*       if (fruit.equals("mango")){
            System.out.println("King of Fruit");
        }
        if (fruit.equals("apple")){
            System.out.println("An apple a day it keeps doctor away");
        }
        */
        switch (fruit) {
            case "mango":
                System.out.println("King of Fruit");
                break;
            case "apple":
                System.out.println("An apple a day it keeps doctor away");
                break;
            case "orange":
                System.out.println("Orange City Nagpur");
                break;
            default:
                System.out.println("No cases for your input");
                break;
        }

        int day = input.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Not a valid week day");
        }

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:{
                System.out.println("WeekDays");
                break;
            }
            case 6:
            case 7:{
                System.out.println("Weekend");
                break;
            }
            default:
                System.out.println("No cases for your input");
                break;
        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> {
                System.out.println("WeekDays");
                break;
            }
            case 6, 7 -> {
                System.out.println("Weekend");
                break;
            }
            default -> System.out.println("No cases for your input");
        }

    }
}
