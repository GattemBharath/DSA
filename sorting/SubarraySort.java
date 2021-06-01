package com.sorting;
import java.util.Arrays;
// A sample Java program to sort a subarray
// using Arrays.sort().
public class SubarraySort {
    public static void main(String[] args) {
        int[] arr = {5, 30, 20, 10, 8};

        // Sort subarray from index 1 to 3, i.e.,
        // only sort subarray {30, 20, 10} and
        // keep other elements as it is.
        Arrays.sort(arr, 1, 4);

        System.out.println(Arrays.toString(arr));
    }
}