package com.bridgelabz;

import java.util.Arrays;

/**
 * @author Govardhan Reddy
 */

public class MergeSorting {
    /**
     * Sort elements of array use merge sorting
     */
    public static void mergeSort(int[] array, int length) {
        if (length < 2) {
            return;
        }
        int mid = (length / 2);
        int[] left = new int[mid];
        int[] right = new int[length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < length; i++) {
            right[i - mid] = array[i];
        }
        /**
         * Use Array.toString method use to return String representation
         */
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        mergeSort(left, left.length);
        mergeSort(right, right.length);
        System.out.println("***************************");
        merge(array, left, left.length, right, right.length);

    }

    public static void merge(int[] array, int[] left, int leftLength, int[] right, int rightLength) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftLength && j < rightLength) {
            if (left[i] < right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < leftLength) {
            array[k++] = left[i++];
        }
        while (j < rightLength) {
            array[k++] = right[j++];
        }
        /**
         * Print all array elements use recursion
         */
        System.out.println("Print sort array :" + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 3, 10, 5, 9, 7};
        int length = array.length;
        mergeSort(array, length);
    }
}
