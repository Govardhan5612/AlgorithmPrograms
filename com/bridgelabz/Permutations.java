package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Govardhan Redyy
 */
public class Permutations {
    /**
     * find the total permutation of string use recursion
     */
    public static void permutation(String word, String answer) {
        if (word.length() == 0) {
            System.out.println(answer);
        } else {
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                String initialSubString = word.substring(0, i);//print element
                String finalSubString = word.substring(i + 1);//delete element
                String result = initialSubString + finalSubString;
                /**
                 * recursion is calling up to loop os ending
                 */
                permutation(result, answer + letter);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = input.next();
        String answer = "";
        permutation(word, answer);
    }

}
