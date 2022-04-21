package com.ashutosh;

import java.util.Arrays;
import java.util.Scanner;

public class Testing{

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] no1 = new int[6];
        int[] no2 = new int[6];

        for (int i = 0; i < no1.length; i++) {
            System.out.print("Please enter no1 : ");
            no1[i] = input.nextInt();
        }

        for (int i = 0; i < no2.length; i++) {
            System.out.print("Please enter no2 : ");
            no2[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(no1));
        System.out.println(Arrays.toString(no2));


        intersections(no1,no2);
    }

    public static void intersections(int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        merge(arr1,arr2);

    }
    private static void merge(int arr1[] ,int arr2[]){
        int i=0,j=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }

    }}

