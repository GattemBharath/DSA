package com.stack;

import java.util.ArrayList;

// Time : Amortized O(1)
public class StackArrayList {
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public void push(int i) {
        arrayList.add(i);
    }

    public int pop() {
        return arrayList.remove(arrayList.size()-1);
    }

    public int size() {
        return arrayList.size();
    }

    public int peek() {
        return arrayList.get(arrayList.size()-1);
    }

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
}

class Test {
    public static void main(String[] args) {
        StackArrayList s = new StackArrayList();
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}

