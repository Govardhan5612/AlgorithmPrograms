package com.bridgelabz;

import java.util.Stack;

/**
 * @author Govardhan Reddy
 */
public class SimpleBalancedParentheses {
    /**
     * Given Arithmetic Expression is Balanced or not
     * use open and close circular bracket
     */
    public static void main(String[] args) {
        String sentence = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
        /**
         * split method use to add elements in array
         */
        String[] array = sentence.split("");
        /**
         * create a Stack list use push ,pop ,size and isEmpty methods
         */
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            /**
             * Equals method return boolean condition
             */
            if (array[i].equals("(") == true) {
                stack.push("(");
            } else if (array[i].equals(")") == true) {
                stack.pop();
            }
        }
        System.out.println("Size of stack : " + stack.size());
        if (stack.isEmpty()) {
            System.out.println("Arithmetic Expression is Balanced");
        } else {
            System.out.println("Arithmetic Expression is not Balanced");
        }
    }
}
