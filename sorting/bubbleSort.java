package com.sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(bubble(new int[]{10, 8, 20, 5}, 4)));
        System.out.println(Arrays.toString(bubble(new int[]{6,8,6,6}, 4)));
        System.out.println(Arrays.toString(bubble(new int[]{20,122,44,98,67}, n)));
        System.out.println(Arrays.toString(bubble(new int[]{2,2,2,2,2}, n)));

    }

    public static int[] bubble(int[] arr, int n) {
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
