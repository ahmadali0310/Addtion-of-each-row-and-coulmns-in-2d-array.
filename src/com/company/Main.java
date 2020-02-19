package com.company;

public class Main {

    public static void main(String[] args) {
	// Declaration and Definitioin of 2D Array
        int arr[] []={
                {1,2,3},
                {1,2,3},
                {1,2,3}
        };
          // Print  the lenght of Array  
        System.out.println("Lenght of Array " + arr.length);
        // Here we start the addition of each rows in Array
        for (int i = 0; i <arr.length ; i++) {
                int sumrows = 0;
            for (int j = 0; j < arr.length; j++) {
                sumrows = sumrows+arr[i][j];
                System.out.print(arr[i][j]+ "     ");
            }
            System.out.println("sum "+ sumrows);

        }

        // Here we start the addition of each columns in Array
        for (int i = 0; i <arr.length ; i++) {
            int sumcolumns = 0;
            for (int j = 0; j < arr.length; j++) {
                sumcolumns = sumcolumns+arr[j][i];

            }
            System.out.print("sum");
            System.out.print(sumcolumns + " ");

        }





    }
}
