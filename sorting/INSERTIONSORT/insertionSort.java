package com.sorting.INSERTIONSORT;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(insertion(new int[]{10, 8, 20, 5}, 4)));
        System.out.println(Arrays.toString(insertion(new int[]{6, 8, 6, 6}, 4)));
        System.out.println(Arrays.toString(insertion(new int[]{20, 122, 44, 98, 67}, n)));
        System.out.println(Arrays.toString(insertion(new int[]{2, 2, 2, 2, 2}, n)));
        System.out.println(Arrays.toString(insertion(new int[]{1, 2, 3, 4, 5}, n)));
    }

    public static int[] insertion(int[] arr, int n) {
        for(int i = 1;i < n;i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
/*
   IN PLACE && STABLE
   IN PLACE = Does not use any auxiliary array or auxiliary space in terms of input size.
   STABLE = When we have two equal elements, their original order is retained.
*/