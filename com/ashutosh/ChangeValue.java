package com.ashutosh;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array non primitive data type
        int[] arr = {1, 2, 3, 4, 5, 6};

        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr) {
        arr[2] = 99; // if you make a change to the object via this ref variable, it will change the original object
    }

}
