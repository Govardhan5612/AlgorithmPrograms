package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Govardhan Reddy
 */
public class BubbleSort {
    /**
     * print integer array in ascending order
     */
    public void bubbleSort(int[] array) {
        int duplicate;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    /**
                     * use swapping of two numbers concept
                     */
                    duplicate = array[i];
                    array[i] = array[j];
                    array[j] = duplicate;
                }
            }
        }
        /**
         * Printing the integer array
         */
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ,");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int number = input.nextInt();
        int[] array = new int[number];
        /**
         * Enter the array numbers from console
         */
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter " + (i + 1) + " number : ");
            array[i] = input.nextInt();
        }
        BubbleSort bubble = new BubbleSort();
        bubble.bubbleSort(array);
    }
}
