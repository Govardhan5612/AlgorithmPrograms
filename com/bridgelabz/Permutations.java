package com.bridgelabz;

public class Permutations {
    public static void permutation(String word, String answer) {
        if (word.length() == 0) {
            System.out.println(answer);
        } else {
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                String result = word.substring(0, i) + word.substring(i + 1);
                permutation(result, answer + letter);
            }
        }
    }

    public static void main(String[] args) {
        String word = "abc";
        String answer = "";
        permutation(word, answer);
    }

}
