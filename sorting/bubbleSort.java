package com.sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(bubble(new int[]{10, 8, 20, 5}, 4)));
        System.out.println(Arrays.toString(bubble(new int[]{6,8,6,6}, 4)));
        System.out.println(Arrays.toString(bubble(new int[]{20,122,44,98,67}, n)));
        System.out.println(Arrays.toString(bubble(new int[]{2,2,2,2,2}, n)));
        System.out.println(Arrays.toString(bubble(new int[]{1,2,3,4,5}, n)));
    }

    public static int[] bubble(int[] arr, int n) {
        for(int i = 0; i < n-1; i++){
            boolean swapped = false;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                swapped = true;
            }
            if(swapped == false)
                break;
        }
        return arr;
    }
}

/*
   Bubble sort is a stable sorting algorithm as it never changes the order of equal elements,
   It is also in place, because it doesn't require any extra array to copy the original elements,
   it modifies the elements within the array only.
 */

/*
  Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
  Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
  Auxiliary Space: O(1)
  Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
  Sorting In Place: Yes
  Stable: Yes
  Due to its simplicity, bubble sort is often used to introduce the concept of a sorting algorithm.
  In computer graphics it is popular for its capability to detect a very small error (like swap of just two elements) in almost-sorted arrays and
  fix it with just linear complexity (2n). For example, it is used in a polygon filling algorithm,
  where bounding lines are sorted by their x coordinate at a specific scan line (a line parallel to x axis)
  and with incrementing y their order changes (two elements are swapped) only at intersections of two lines.
*/