package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Govardhan Reddy
 */
public class SearchWordFromList {
    /**
     * Use Array class binarySearch static method to find word contains in list or not
     */
    public static void main(String[] args) {
        /**
         * Take a paragraph is input
         */
        String paragraph = "Java array is an object which contains elements of a similar data type";
        String[] array = paragraph.toLowerCase().split(" ");
        /**
         * take word from console use Scanner object
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String word = input.next();
        /**
         * Use sorting method and the sorted array is use in binary search
         */
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "-->" + array[i] + " ");
        }
        System.out.println();
        /**
         * In binary search method input are sorted array and search word
         * It is returns index number it is true
         * It returns less then 0 values it is false
         */
        if (Arrays.binarySearch(array, word) >= 0) {
            System.out.println(word + " is contains in the array list");
        } else {
            System.out.println(word + " is not contains in the array list");
        }
    }
}
