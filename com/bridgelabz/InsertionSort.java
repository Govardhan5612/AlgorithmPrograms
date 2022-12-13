package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Govardhan Reddy
 */
public class InsertionSort {
    /**
     * Print the string array in sorting order
     *
     * @param array
     */
    public void insertionSort(String[] array) {
        String temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].compareTo(array[j]) < 0) {
                    /**
                     * use swapping concept
                     */
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        /**
         * print the string array
         */
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ,");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// take inputs from the user
        System.out.print("Enter the size of array : ");
        int number = input.nextInt();
        String[] array = new String[number];
        /**
         * take words from the console
         */
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter " + (i + 1) + " word : ");
            array[i] = input.next();
        }
        InsertionSort insertion = new InsertionSort();
        insertion.insertionSort(array);
    }

}
