package com.collections;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Demo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner  = new Scanner(System.in);
        for (int i=1;i<=5;i++){
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search(3));
        Stack<String> stack2 = new Stack<String>();
        stack2.push("Geeks");
        stack2.push("For");
        stack2.push("Geeks");
        System.out.println(stack2);
    }
}
