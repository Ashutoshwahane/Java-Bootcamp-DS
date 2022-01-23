package com.ashutosh;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDataClass {
    public static void main(String[] args) {

        // syntax
        /*
            datatype[] variable_name = new datatype[size];
            // store 5 roll number
         */
        int[] roll_no = new int[5]; // LHS int[] roll_no -> this thing happens at compile time | RHS new int[5]; -> happens at run time.
        // OR
        int[] roll_no1 = {2, 4, 5, 6, 1};

        int[] roll_no2; // Declaration of array, roll_no2 is getting defined in the stack
        roll_no2 = new int[3]; // Initialisation, actually here object is being created in the heap

        /*
         * Documentation : 1) array objects are in heap,
         * 2) heap object are not continuous,
         * 3) Dynamic memory allocation
         * Note: it depends on JVM may be not continuous
         *       |1|5|6|7|123|33| -> array
         *       array[4] = 123
         * New Keyword : new is used to create an object
         * Primitive stores in stack memory only, and all the other object are stored in the heap memory
         * * */
        String[] names = new String[5];
        System.out.println(names[0]); // null


        nonPrimitiveInput();


    }

    static void input() {
        // input using for loop
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5]; // array of primitives

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number: ");
            arr[i] = input.nextInt();
        }

        for (int j: arr){
            System.out.print(j + " "); // elements of arr
        }

        System.out.println(Arrays.toString(arr));
    }

    static void nonPrimitiveInput(){
        Scanner input = new Scanner(System.in);
        String[] arr = new String[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a string: ");
            arr[i] = input.next();
        }

        System.out.println(Arrays.toString(arr));
    }

}
