package com.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Vector_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Vector vc = new Vector();
        for (int i=0;i<n;i++){
            vc.add(i);
        }
        System.out.println(vc.toString());
        Vector<String> v = new Vector<String>();
//        for (int i=0;i<n;i++){
//            v.add(scanner.next());
//        }
        v.add("Bharath");
        v.add("Akhila");
        v.add("Simha");
        v.add("Indira");
        v.add("RL");
        v.add(4,"Akhila");
        v.remove(1);
        System.out.println(v.toString());

    }
}
