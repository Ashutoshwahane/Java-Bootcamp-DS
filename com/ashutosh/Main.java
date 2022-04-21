package com.ashutosh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // print, Standard output stream
        System.out.print(10);
        System.out.println("Ashutosh Wahane");

        // input, Standard input stream
        /*Scanner input = new Scanner(System.in);
        System.out.println(input.next());   // string
        System.out.println(input.nextLine()); // string line*/

        Car car = new Car();
        Car lamborgini = new Car("lamborgini");
        Car noOfCar = new Car(10);
    }

}

class Car{

    Car() {
        System.out.println("default constructor");
    }

    Car(String name){
        System.out.println("Parameter contructor : " + name);
    }

    Car(int noOfCar){
        System.out.println("Overloading contructor : " + noOfCar);
    }

}
