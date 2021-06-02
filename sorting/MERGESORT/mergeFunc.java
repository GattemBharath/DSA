/*  Merge function of Merge sort
    This video is a complex version of the previously discussed problem on Merge Sort.
    Here we take a single array with three points namely, the lower, the middle and the highest point.
    The elements from the lower to the middle are sorted and the elements from the (middle+1) to the higher are sorted.
    The task is to merge these two sorted parts into one.
*/
package com.sorting.MERGESORT;

import java.util.Arrays;

public class mergeFunc {
    public static void main(String[] args) {
        int[] a = {10,15,20,40,8,11,55};
        //System.out.println(Arrays.toString(merge(a,b)));
        merge(a,0,3,6);
    }

    public static void merge(int[] a,int low,int mid,int high) { //TIME: O(n) , AXILIARY SPACE: O(n)
        int n1 = mid - low +1, n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        //System.arraycopy(a,low,left,0,mid-low+1);
        //System.arraycopy(a,mid+1,right,0,high-mid);
        for(int i = 0;i < n1;i++) {
            left[i] = a[low + i];
        }
        for(int i = 0;i < n2;i++){
            right[i] = a[mid + i +1];
        }
        System.out.println("Left Array is ... "+Arrays.toString(left));
        System.out.println("Right Array is ... "+Arrays.toString(right));
        int i = 0,j = 0,k = 0;
        while (i < n1 && j < n2){
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            }
            else{
                a[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            a[k] = left[i];
            i++;
            k++;
        }
        while (j < n2){
            a[k] = right[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(a));
    }
}
