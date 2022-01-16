package com.ashutosh;

public class BasicLoop {
    public static void main(String[] args) {
        int a = 10;
        if (a == 10){
            System.out.println("Hello World");
        }

        // while loop
        /** Tips
         * when you don't know how many times the loop runs use while loop
         * */
        while (a<10){
            System.out.println("running while loop" + a);
            a++;
        }

        /**Tips
         * when you know how many times the loop runs use for loop
         * */
        for (int count = 1; count <= 5; count++){
            System.out.println("running For loop");
        }
    }
}
