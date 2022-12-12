package com.bridgelabz;

/**
 * @author Govardhan Reddy
 */
public class PrimeNumbersInRange {
    /**
     * Check weather number is prime number
     */
    public int primeNumber(int number) {
        boolean status = true;
        int primeNumber = 100;
        if (number == 0 || number == 1) {
            status = false;
        } else if (number == 2) {
            status = true;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    status = false;
                    break;
                }
            }
        }
        if (status == true) {
            primeNumber = number;
            return primeNumber;
        } else {
            return primeNumber;
        }
    }

    /**
     * Print the prime numbers in range
     */
    public static void main(String[] args) {
        int firstNumber = 0;//initial number
        int lastNumber = 1000;//final number
        PrimeNumbersInRange prime = new PrimeNumbersInRange();
        for (int i = firstNumber; i <= lastNumber; i++) {
            int number = prime.primeNumber(i);
            if (number != 100) {
                System.out.print(i + " ,");
            }
        }
    }
}
