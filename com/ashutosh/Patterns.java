package com.ashutosh;

public class Patterns {
    public static void main(String[] args) {

//        pattern1(6);
//        pattern2(6);
//        pattern3(6);
        pattern4(6);

    }

    static void pattern1(int no){
        for (int row = 1; row <= no; row++) {
            // for every row, run the column
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            // after a row is printed, we need to add a new line
            System.out.println();
        }

        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

        */
    }

    static void pattern2(int no){
        for (int row = 1; row <= no; row++) {
            // for every row, run the column
            for (int col = 1; col <= no ; col++) {
                System.out.print("* ");
            }
            // after a row is printed, we need to add a new line
            System.out.println();
        }

        /*
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
        */
    }

    static void pattern3(int no){
        for (int row = 1; row <= no; row++) {
            // for every row, run the column
            for (int col = 1; col <= no-row+1  ; col++) {
                System.out.print("* ");
            }
            // after a row is printed, we need to add a new line
            System.out.println();
        }
        /*
            * * * * * *
            * * * * *
            * * * *
            * * *
            * *
            *
        */
    }

    static void pattern4(int no){
        for (int row = 1; row <= no ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

      /*  1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
      */

    }

    static void pattern5(int no){
        for (int i = 1; i < no * 2 ; i++) {
            
        }
    }
}
