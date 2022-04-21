package com.ashutosh;

import static java.lang.System.in;

public class LinearSearch {

    public static void main(String[] args){

        int [] nums = {19,123,523,63,1,5,723,88};
        int target = 5;

        int ans = linearSearch(nums, target);
        System.out.print(ans);

    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // run a for loop
        for (int i = 0; i < arr.length; i++){
            // check for element at every index if it is equal to target element
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        // if the target element is not present in the array return -1
        return -1;
    }

    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // run a for loop
        for (int element: arr){
            if (element == target){
                return element;
            }
        }
        // if the target element is not present in the array return -1
        return Integer.MAX_VALUE;
    }
}
