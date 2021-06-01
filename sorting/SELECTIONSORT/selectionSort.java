package com.sorting.SELECTIONSORT;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(selection(new int[]{10, 8, 20, 5}, 4)));
        System.out.println(Arrays.toString(selection(new int[]{6, 8, 6, 6}, 4)));
        System.out.println(Arrays.toString(selection(new int[]{20, 122, 44, 98, 67}, n)));
        System.out.println(Arrays.toString(selection(new int[]{2, 2, 2, 2, 2}, n)));
        System.out.println(Arrays.toString(selection(new int[]{1, 2, 3, 4, 5}, n)));
    }

// IN PLACE && NOT STABLE
public static int[] selection(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        return arr;
    }
    /*    int[] temp = new int[n];
        for(int i = 0; i < n; i++){
            int min_index = 0;
            for(int j = 1; j < n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            temp[i] = arr[min_index];
            arr[min_index] = Integer.MAX_VALUE;
        }
        for(int i = 0; i < n; i++){
           arr[i] = temp[i];
       }
        return arr;
    }
     */
}

