package com.sorting.MERGESORT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class merge2SortedArr {
    public static void main(String[] args) {
        int a[] = {10,15,20};
        int b[] = {5,6,6,15};
        //System.out.println(Arrays.toString(merge(a,b)));
        merge(a,b);
    }

    public static void merge(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]){
                System.out.println(a[i]);
                i++;
            }
            else{
                System.out.println(b[j]);
                j++;
            }
        }
        while(i<a.length) {
            System.out.println(a[i]);
            i++;
        }
        while(j<b.length) {
            System.out.println(b[j]);
            j++;
        }
        //        int m = a.length;
//        int n = b.length;
//        int c[] = new int[m+n];
//        for(int i=0;i<m;i++){
//            c[i] =a[i];
//        }
//        for (int i=0;i<n;i++){
//            c[m+i] = b[i];
//        }
//        Arrays.sort(c);
//        return c;
    }
}
