package com.ashutosh;

import java.util.Arrays;

public class MultiDimensionArray {

    public static void main(String[] args) {
        /*
        *  1 2 3
        *  4 5 6
        *  7 8 9
        *
        * * */

        int[][] arr = new int[3][2];

        int [][] matrixArray = {
                {1,2,3}, // 0th index
                {4,5,6,9}, // 1st index
                {7,8,9} // 2nd index
        };
        System.out.println();
        // for each row = i
        /*for (int row = 0; row < matrixArray.length; row++) {
            System.out.println(Arrays.toString(matrixArray[row]));
            // for each column = j
            for (int column = 0; column < matrixArray[row].length; column++){
//                System.out.print(matrixArray[row][column] + " ");
            }
            System.out.println();
        }*/

        for (int[] a: matrixArray) {
            System.out.println(Arrays.toString(a));

        }




    }
}
