package com.bridgelabz;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Govardhan Reddy
 */
public class UnOrderedList {
    /**
     * create a linked list add and remove operations are used
     */
    public void unOrderedList(String[] array) {
        LinkedList<String> linkedList = new LinkedList<>();
        /**
         * array elements are add in linked list
         */
        for (int i = 0; i < array.length; i++) {
            linkedList.add(array[i]);
        }
        System.out.println("Unordered linked list : "+linkedList);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the search word : ");
        String word = input.next();
        /**
         * remove elements in linked list
         */
        if (linkedList.contains(word) == true) {
            linkedList.remove(word);
            System.out.println(word + " is removed from linked list");
        }
        /**
         * add elements in linked list
         */
        else {
            linkedList.add(word);
            System.out.println(word + " is added in linked list");
        }
        System.out.println("Unordered linked list : "+linkedList);
    }

    public static void main(String[] args) {
        String sentence = "Read from file the list of Words and take user input to search a Text";
        String[] array = sentence.toLowerCase().split(" ");
        UnOrderedList list = new UnOrderedList();
        list.unOrderedList(array);

    }
}
