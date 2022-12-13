package com.bridgelabz;

import java.util.Arrays;

/**
 * @author Govardhan Reddy
 */
public class SearchAndSortUseGenerics {
    /**
     *Use generics find sorting array and searching value
     */
    public static <T> void searchAndSort(T []array,T word){
        /**
         * create a method generics to allow the all types of objects
         * Use Array class sort static method
         * Use Array class binarySearch static method
         */
        Arrays.sort(array);
        System.out.println("Sorting order : ");
        for (int i=0;i<array.length;i++){
            System.out.print(i+"-->"+array[i]+" ,");
        }
        System.out.println();
        if (Arrays.binarySearch(array,word)>=0){
            System.out.println(word + " is contains in the array list");
        }
        else {
            System.out.println(word + " is not contains in the array list");
        }
    }

    public static void main(String[] args) {
        /**
         * Take Integer array and number pass in method generics
         */
        System.out.println("Integer Array : ");
        Integer []intArray = {1,2,3,4,5,8,7,9,6,5,8,4,2,5};
        Integer intNumber = 10;
        searchAndSort(intArray,intNumber);
        /**
         * Take Float array and decimal value pass in method generics
         */
        System.out.println("Float Array : ");
        Float []floatArray = {1.5f,5.6f,6.4f,6.5f,6.8f};
        Float floatNumber = 5.6f;
        searchAndSort(floatArray,floatNumber);
        /**
         * Take String array and string value pass in method generics
         */
        System.out.println("String Array : ");
        String []stringArray = {"Ramu","Somu","Govardhan","Harish","Nagaraj"};
        String stringWord = "Ramu";
        searchAndSort(stringArray,stringWord);

    }
}
