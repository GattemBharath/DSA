package com.collections;
import java.io.*;
import java.util.*;
public class ArrayList_Demo {
    public static void main(String[] args)
    {
         int n=5;
         ArrayList al = new ArrayList();
         for (int i=1;i<=n;i++){
             al.add(i);
         }
         System.out.println(al);
         al.remove(3);
         System.out.println(al);
         for (int i=0;i<al.size();i++){
             System.out.print(al.get(i)+" ");
         }
         al.add("Bharath");
         al.add(2,"Simha");
         System.out.println();
         System.out.println(al);
         al.set(1,"Akhila");
         System.out.println(al);
         al.remove("Bharath");
         System.out.println(al);
         System.out.println(al.contains("Simha") ? "YES" : "NO");
         System.out.println(al.lastIndexOf(5));

    }

}