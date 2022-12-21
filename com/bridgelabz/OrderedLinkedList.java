package com.bridgelabz;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Govardhan Redyy
 */
public class OrderedLinkedList {
    /**
     * create a linked list add and remove operations are used
     */
    /**
     * create a linked list add and remove operations are used
     */
   public void orderedList(Integer [] array){
       LinkedList<Integer> linkedList = new LinkedList<>();
       /**
        * array elements are add in linked list
        */
       for (int i = 0; i < array.length; i++) {
           linkedList.add(array[i]);
       }
       System.out.println("Unordered linked list : " + linkedList);
       Collections.sort(linkedList);
       System.out.println("Ordered linked list : " + linkedList);
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the search number : ");
       Integer number = input.nextInt();
       /**
        * remove elements in linked list
        */
       if (linkedList.contains(number) == true) {
           linkedList.remove(number);
           System.out.println(number + " is removed from linked list");
       }
       /**
        * add elements in linked list
        */
       else {
           linkedList.add(number);
           System.out.println(number + " is added in linked list");
       }
       Collections.sort(linkedList);
       System.out.println("Ordered linked list : " + linkedList);
   }
    public static void main(String[] args) {
        Integer [] array = {12,56,74,51,65,41,52,63,65,48};
        OrderedLinkedList list = new OrderedLinkedList();
        list.orderedList(array);
    }
}
