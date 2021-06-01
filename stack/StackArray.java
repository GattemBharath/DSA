package com.stack;

// Time : O(1)
public class StackArray {
    int arr[];
    int cap;
    int top;
    StackArray(int c){
        cap = c;
        top = -1;
        arr = new int[cap];
    }
    public void push(int i) {
        if(top==cap-1){
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] =  i;
    }

    public int pop() {
        if(top == -1)
            System.out.println("Stack is empty");
        int res = arr[top];
        top--;
        return res;
    }

    public int size() {
        return top+1;
    }

    public int peek() {
         if(top == -1)
             System.out.println("Stack is empty");
         return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

class GFG{
    public static void main (String[] args)
    {
        StackArray s=new StackArray(5);
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}