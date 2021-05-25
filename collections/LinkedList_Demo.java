package com.collections;

import java.io.*;
import java.util.*;
class LinkedList_Demo{
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Indira");
        ll.add("Bharath");
        ll.add("Simha");
        ll.addFirst("Akhila");
        ll.addLast("GNR");
        System.out.println(ll);
        for (int i=0;i<ll.size();i++){
            System.out.print(i!=ll.size()-1?ll.get(i)+" and ":ll.get(i));
        }
    }
}