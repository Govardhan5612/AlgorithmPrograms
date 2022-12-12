package com.bridgelabz;

/**
 * @author Govardhan Reddy
 */
public class PrimePalindrome extends PrimeNumbersInRange {
    /**
     * Given number is palindrome number or not
     */
    public void palindromeNumber(int number) {
        int duplicate = number;
        int remainder = 0;
        int reverse = 0;
        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if (reverse == duplicate) {
            System.out.print(duplicate + " ,");
        }
    }

    /**
     * Print prime palindrome number in range
     */
    public static void main(String[] args) {
        PrimePalindrome palindrome = new PrimePalindrome();
        int firstNumber = 0;//initial number
        int lastNumber = 1000;//final number
        for (int i = firstNumber; i <= lastNumber; i++) {
            palindrome.palindromeNumber(palindrome.primeNumber(i));
        }
    }
}
