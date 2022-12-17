package com.bridgelabz;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author Govardhan Reddy
 */
public class Palindrome {
    /**
     * check the word is palindrome or not use deque
     */
    public static void isPalindrome(String word) {
        Deque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < word.length(); i++) {
            queue.add(word.toLowerCase().charAt(i));
        }
        System.out.println(queue);
        boolean status = true;
        for (int i = 0; i <= word.length() / 2; i++) {
            if (queue.peekFirst() == queue.peekLast() == false) {
                status = false;
                break;
            }
            queue.pollFirst();
            queue.pollLast();
        }
        if (status == true) {
            System.out.println(word + " is palindrome");
        } else {
            System.out.println(word + " is not palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word : ");
        String word = input.next();
        isPalindrome(word);
    }
}