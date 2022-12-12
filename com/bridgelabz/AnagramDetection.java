package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Govardhan Reddy
 */
public class AnagramDetection {
    /**
     * @param firstWord
     * @param secondWord
     * check the two words are anagrams or not
     */
    public void anagram(String firstWord, String secondWord) {
        if (firstWord.length() == secondWord.length()) {
            /**
             * String word converted to string array using split method
             */
            String[] firstArray = firstWord.toLowerCase().split("");
            String[] secondArray = secondWord.toLowerCase().split("");
            /**
             * Arrays class sort static method use arrange the array elements ascending order
             */
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            /**
             * Arrays class static equals method check two arrays are equal or not
             */
            if (Arrays.equals(firstArray, secondArray) == true) {
                System.out.println(firstWord + " and " + secondWord + " are anagrams");
            } else {
                System.out.println(firstWord + " and " + secondWord + " are not anagrams");
            }
        } else {
            System.out.println(firstWord + " and " + secondWord + " are not anagrams");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first word : ");
        String firstWord = input.next();
        System.out.print("Enter second word : ");
        String secondWord = input.next();
        AnagramDetection anagram = new AnagramDetection();
        anagram.anagram(firstWord, secondWord);
    }
}
