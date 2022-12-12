package com.bridgelabz;

public class PrimePalindrome extends PrimeNumbersInRange{

    public void palindromeNumber(int number){
        int duplicate = number;
        int remainder=0;
        int reverse=0;
        while (number!=0){
            remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        if (reverse==duplicate){
            System.out.print(duplicate+" ,");
        }
    }

    public static void main(String[] args) {
        PrimePalindrome palindrome = new PrimePalindrome();
        for (int i = 0;i<=1000;i++) {
            palindrome.palindromeNumber(palindrome.primeNumber(i));
        }
    }

}
