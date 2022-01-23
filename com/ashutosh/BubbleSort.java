package com.ashutosh;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numberArr = {12,245,47,23,16,8,2,14,0};
        sort(numberArr);
    }

    static void sort(int[] arr){
        for (int i=0; i <= arr.length; i++){
            for (int j=1; j < arr.length - i; j++){
                if (arr[j] < arr[j-1]){
                    /*int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;*/
                    arr[j-1] = arr[j-1] ^ arr[j]; // XOR Operator›
                    arr[j] = arr[j-1] ^ arr[j];
                    arr[j-1] = arr[j-1] ^ arr[j];
                }
            }
        }
        System.out.println("The sorted array is : " + Arrays.toString(arr));
    }
}
