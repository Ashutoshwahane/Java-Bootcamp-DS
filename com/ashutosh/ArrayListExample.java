package com.ashutosh;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>(5); // Integer wrapper class for int ( no support for generic type)
/*
        list.add(100);
        list.add(4567);
        list.add(634);
        list.add(3);
        list.add(63);
        list.add(24);
        list.add(436);

        list.set(1,999);
        System.out.println(list.contains(1050));
        list.remove(2);
        System.out.println(list);*/

        // get item at arraylist
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        System.out.println(list);
    }
}
