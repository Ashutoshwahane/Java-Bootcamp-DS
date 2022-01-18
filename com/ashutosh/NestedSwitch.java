package com.ashutosh;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empId = input.nextInt();
        String department = input.next();

        switch (empId){
            case 1 -> {
                System.out.println("Ashutosh Wahane");
            }
            case 2 -> {
                System.out.println("Wills Khalifa");
            }
            case 3-> {
                System.out.println("Goldy");
                switch (department){
                    case "IT" -> {
                        System.out.println("Software Development Engineer");
                    }
                    case "HR" -> {
                        System.out.println("Human Resource Department");
                    }
                    default -> System.out.println("Not valid Department");
                }
            }
            default -> System.out.println("Not Valid Emp Id");
        }

    }

}
