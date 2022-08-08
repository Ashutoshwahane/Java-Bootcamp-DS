package com.ashutosh;

/**
 * arr[] = {1,2,3,4,5}
 * rotate arr 1 = { 2,3,4,5,1 } , 2 = { 3,4,5,1,2}
 */
public class Rotate {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        // user input
        int no = 4;
        int firstElement;


        for (int i = 0; i < no; i++) {
            firstElement = arr[0];

            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[4] = firstElement;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
